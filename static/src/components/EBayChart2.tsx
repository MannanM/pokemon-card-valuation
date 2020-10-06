import React from "react";
import {TimeSeries, TimeEvent, TimeRange} from "pondjs";
import {
    Resizable,
    Charts,
    ChartContainer,
    ChartRow,
    YAxis,
    ScatterChart
} from "react-timeseries-charts";

export interface EBayChart2Props {
    data: Array<Array<any>>
}

export interface EBayChart2State {
    hover: any,
    highlight: any,
    tracker: any
}

export class EBayChart2 extends React.Component<EBayChart2Props, EBayChart2State> {
    state = {
        hover: null,
        highlight: null,
        tracker: null
    };

    handleSelectionChanged = point => {
        console.log(point.event as TimeEvent);
        console.log(point.event.get('ebayid'));
    };

    handleMouseNear = point => {
        this.setState({
            highlight: point
        });
    };

    render() {
        const series = new TimeSeries({
            name: "ebay-sold-price",
            columns: ["time", "price", "ebayid"],
            points: this.props.data.map(([d, value]) => [
                new Date(d),
                value,
                Math.random().toString()
            ])
        });
        const start = new Date(series.range().begin().getTime() - (24*60*60*1000));
        const end = new Date(series.range().end().getTime() + (24*60*60*1000));
        const highlight = this.state.highlight;
        let text = `Price: $ -, time: -:--`;
        let infoValues = [];
        if (highlight) {
            const speedText = `$${highlight.event.get(highlight.column)}`;
            text = `
                Price: ${speedText},
                time: ${this.state.highlight.event.timestamp().toLocaleDateString()}:${this.state.highlight.event.timestamp().toLocaleTimeString()} 
            `;
            infoValues = [{label: "Last Price", value: speedText}];
        }

        //  const heat = [
        //     "#023858",
        //     "#045a8d",
        //     "#0570b0",
        //     "#3690c0",
        //     "#74a9cf",
        //     "#a6bddb",
        //     "#d0d1e6",
        //     "#ece7f2",
        //     "#fff7fb"
        // ];

        const perEventStyle = (column, event) => {
            const color = "steelblue"; // heat[Math.floor((1 - event.get("price") / 40) * 9)];
            return {
                normal: {
                    fill: color,
                    opacity: 1.0
                },
                highlighted: {
                    fill: color,
                    stroke: "none",
                    opacity: 1.0
                }
            };
        };

        const timeAxisStyle = {
            values: {valueColor: "Green", valueWeight: 200, valueSize: 12}
        };

        const YAxisStyle = {
            axis: {axisColor: "#C0C0C0"},
            label: {labelColor: "Blue", labelWeight: 100, labelSize: 12},
            values: {valueSize: 12}
        };

        return (
            <div>
                <div>
                    <Resizable>
                        <ChartContainer
                            timeRange={new TimeRange(start, end)}
                            timeAxisStyle={timeAxisStyle}
                            trackerPosition={this.state.tracker}
                            trackerStyle={{
                                box: {
                                    fill: "black",
                                    color: "#DDD"
                                },
                                line: {
                                    stroke: "red",
                                    strokeDasharray: 2
                                }
                            }}
                            maxTime={start}
                            minTime={end}
                            enablePanZoom={false}
                            onTrackerChanged={tracker => this.setState({tracker})}
                        >
                            <ChartRow
                                height="150"
                                debug={false}
                                trackerInfoWidth={125}
                                trackerInfoHeight={30}
                                trackerInfoValues={infoValues}
                            >
                                <YAxis
                                    id="price-range"
                                    label="Sold $AUD"
                                    labelOffset={-5}
                                    min={0}
                                    max={series.max("price")}
                                    style={YAxisStyle}
                                    width="70"
                                    type="linear"
                                    format=",.2f"
                                />
                                <Charts>
                                    <ScatterChart
                                        axis="price-range"
                                        series={series}
                                        columns={["price"]}
                                        style={perEventStyle}
                                        format=".1f"
                                        selected={null}
                                        onSelectionChange={p => this.handleSelectionChanged(p)}
                                        onMouseNear={p => this.handleMouseNear(p)}
                                        highlight={this.state.highlight}
                                        radius={3}
                                    />
                                </Charts>
                            </ChartRow>
                        </ChartContainer>
                    </Resizable>
                </div>
                <div>{text}</div>
            </div>
        );
    }
}
