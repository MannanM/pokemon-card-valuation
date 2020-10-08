import React from "react";
import {TimeEvent, TimeRange, TimeSeries} from "pondjs";
import {
    Baseline,
    ChartContainer,
    ChartRow,
    Charts,
    Resizable,
    ScatterChart,
    YAxis
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
        const win = window.open(`https://www.ebay.com.au/itm/${point.event.get('ebayid')}`, '_blank');
        win.focus();
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
            points: this.props.data.map(([date, value, id]) => [
                new Date(date),
                value,
                id
            ])
        });
        const start = new Date(series.range().begin().getTime() - (24 * 60 * 60 * 1000));
        const end = new Date(series.range().end().getTime() + (24 * 60 * 60 * 1000));
        const highlight = this.state.highlight;
        let text = `Price: $ -, time: -:--`;
        let infoValues = [];
        if (highlight) {
            const speedText = `$${highlight.event.get(highlight.column).toFixed(2)}`;
            text = `
                Price: ${speedText},
                time: ${this.state.highlight.event.timestamp().toLocaleDateString()}:${this.state.highlight.event.timestamp().toLocaleTimeString()} 
            `;
            infoValues = [{label: "Last Price", value: speedText}];
        }

        return (
            <div>
                <div>
                    <Resizable>
                        <ChartContainer
                            timeRange={new TimeRange(start, end)}
                            trackerPosition={this.state.tracker}
                            maxTime={start}
                            minTime={end}
                            enablePanZoom={false}
                            onTrackerChanged={tracker => this.setState({tracker})}
                        >
                            <ChartRow
                                height="150"
                                trackerInfoValues={infoValues}
                            >
                                <YAxis
                                    id="price-range"
                                    label="Sold $AUD"
                                    labelOffset={-5}
                                    min={0}
                                    max={series.max("price") + series.stdev("price")}
                                    width="70"
                                    type="linear"
                                    format="$,.2f"
                                />
                                <Charts>
                                    <ScatterChart
                                        axis="price-range"
                                        series={series}
                                        columns={["price"]}
                                        format=".2f"
                                        selected={null}
                                        onSelectionChange={p => this.handleSelectionChanged(p)}
                                        onMouseNear={p => this.handleMouseNear(p)}
                                        highlight={this.state.highlight}
                                        radius={5}
                                    />
                                    <Baseline
                                        axis="price-range"
                                        value={series.avg("price")}
                                        label={`Average Price $${series.avg('price').toFixed(2)}`}
                                        position="right"
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
