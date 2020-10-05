import React from "react";
import {TimeSeries, Index} from "pondjs";
import {
    Resizable,
    Charts,
    ChartContainer,
    ChartRow,
    YAxis,
    LineChart,
    styler
} from "react-timeseries-charts";

export interface EBayChartProps{
    data: Array<Array<any>>
}

export class EBayChart extends React.Component<EBayChartProps> {
    render() {
        const series = new TimeSeries({
            name: "hilo_rainfall",
            columns: ["index", "precip"],
            points: this.props.data.map(([d, value]) => [
                Index.getIndexString("1h", new Date(d)),
                value
            ])
        });

        console.log("series is ", series);
        const style = styler([
            {
                key: "precip",
                color: "#A5C8E1",
                selected: "#2CB1CF"
            }
        ]);

        return (
            <Resizable>
                <ChartContainer timeRange={series.range()}>
                    <ChartRow height="150">
                        <YAxis
                            id="rain"
                            label="Sale Price"
                            min={Math.min.apply(Math, this.props.data.map(function([, value]) { return value; }))}
                            max={Math.max.apply(Math, this.props.data.map(function([, value]) { return value; }))}
                            format="$.2f"
                            type="linear"
                        />
                        <Charts>
                            <LineChart
                                axis="rain"
                                style={style}
                                spacing={1}
                                columns={["precip"]}
                                series={series}
                                minBarHeight={1}
                            />
                        </Charts>
                    </ChartRow>
                </ChartContainer>
            </Resizable>
        );
    }
}