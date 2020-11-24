import React from 'react';
import {Baseline, LineChart} from 'react-timeseries-charts';
// @ts-ignore because avg and sum aren't exported properly
import {avg, IndexedEvent, sum, TimeRange, TimeSeries} from 'pondjs';

const defaultStyle = {
    label: {
        fill: '#8B7E7E', // Default label color
        fontWeight: 100,
        fontSize: 11
    },
    line: {
        stroke: '#626262',
        strokeWidth: 1,
        strokeDasharray: '5,3',
    }
};

//the grouping of events (rollup) in days (e.g. 1 = daily, 7 = weekly etc)
const interval = 1;

interface TrendlineProps {
    axis: string,
    column: string,
    series: TimeSeries,
    range: TimeRange,
}

interface TrendLineState {
    weeklyTrend: number,
    trendSeries: TimeSeries,
}

export default class TrendLine extends React.Component<TrendlineProps, TrendLineState> {
    constructor(props: Readonly<TrendlineProps>) {
        super(props);
        this.state = this.calculateState();
    }

    componentDidUpdate(prevProps: Readonly<TrendlineProps>) {
        if (prevProps?.series !== this.props.series || prevProps?.range !== this.props.range) {
            this.setState(
                this.calculateState()
            );
        }
    }

    private calculateState(): TrendLineState {
        const aggregation = TrendLine.createObject(
            this.props.column,
            TrendLine.createObject(
                this.props.column,
                avg()
            )
        );

        const newRollup = this
            .props
            .series
            .crop(this.props.range)
            .fixedWindowRollup({
                windowSize: interval + 'd',
                aggregation: aggregation,
                toEvents: true
            })
            .toJSON();

        if (!newRollup) {
            return {
                trendSeries: new TimeSeries({name: 'trendline', events: []}),
                weeklyTrend: 0
            };
        }
        const points = newRollup.points;
        const trend = this.calculateTrendFromFixedWindowRollupTimeSeries(points);
        const firstDay = TrendLine.extractDate(points[0][0]) - 1;
        const lastDay = TrendLine.extractDate(points[points.length - 1][0]) + 1;
        return {
            trendSeries: new TimeSeries(
                {
                    name: 'trendline',
                    events: [
                        TrendLine.newIndexedEvent(firstDay, trend.calcY, this.props.column),
                        TrendLine.newIndexedEvent(lastDay, trend.calcY, this.props.column)
                    ]
                }
            ),
            weeklyTrend: trend.slope * (7/interval)
        };
    }

    private static newIndexedEvent(firstDay: number, calcY: (x: number) => number, column: string): IndexedEvent {
        return new IndexedEvent(
            `${interval}d-${firstDay}`,
            this.createObject(column, calcY(firstDay)),
            null
        );
    }

    private calculateTrendFromFixedWindowRollupTimeSeries(points) {
        const xData: number[] = [];
        const yData: number[] = [];
        points.forEach(([x, y]) => {
            xData.push(TrendLine.extractDate(x))
            yData.push(parseInt(y));
        });
        return createTrend(xData, yData);
    }

    private static extractDate(x): number {
        return parseInt(x.split('-')[1]);
    }

    private static createObject(column: string, value: any) {
        const obj = {};
        obj[column] = value;
        return obj;
    }

    render() {
        if (!this.state.trendSeries) {
            return <React.Fragment/>
        }

        if (Math.abs(this.state.weeklyTrend) < 1) {
            const value = this.props.series.avg(this.props.column, e => e);
            const label = `Avg: $${value.toFixed(2)}`;
            return TrendLine.chartAndLabel(label, <Baseline {...this.props} value={value} label={''}/>)
        } else {
            const label = `Trend: $${this.state.weeklyTrend.toFixed(2)}/week`;
            return TrendLine.chartAndLabel(label, <LineChart
                {...this.props}
                columns={[this.props.column]}
                series={this.state.trendSeries}
                style={TrendLine.createObject(this.props.column, {normal: defaultStyle.line})}
            />)
        }
    }

    private static chartAndLabel(label: string, baseline: any) {
        return <React.Fragment>
            {baseline}
            <g className='baseline'>
                <text x={5} y={138} textAnchor={'start'} style={defaultStyle.label}>{label}</text>
            </g>
        </React.Fragment>;
    }
}

export function createTrend(xData: number[], yData: number[]) {
    const xMean = avg()(xData);
    const yMean = avg()(yData);
    const xMinusxMean = xData.map((val) => val - xMean);
    const yMinusyMean = yData.map((val) => val - yMean);
    const xMinusxMeanSq = xMinusxMean.map((val) => Math.pow(val, 2));
    const xy = [];
    for (let x = 0; x < xData.length; x++) {
        xy.push(xMinusxMean[x] * yMinusyMean[x]);
    }
    const xySum = sum()(xy);
    const slope = xySum / sum()(xMinusxMeanSq);
    const initial = yMean - slope * xMean;
    return {
        slope: slope,
        calcY: (x) => initial + slope * x,
    };
}
