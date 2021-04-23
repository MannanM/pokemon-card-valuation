import React, { Component, ReactNode } from "react";
import ReactTooltip from "react-tooltip";
import { PieChart } from "react-minimal-pie-chart";
import { Data, DataEntry } from "react-minimal-pie-chart/types/commonTypes";
import { GoogleAnalytics } from "../../analytics/GoogleAnalytics";
import { CardData } from "../../data/Api";
import { Utils } from "../../util/Utils";

interface CardImageState {
    hovered?: number
}

interface CardImageProps {
    data: PieSlice[],
    avgCost: number,
    onChange: (any) => void
}

export interface PieSlice {
    cardId: string,
    card: CardData,
    averageValue: number
}

function makeTooltipContent(entry: DataEntry) {
    return `#${entry.cardId} ${entry.tooltip} average sale price ${Utils.formatCurrency(entry.value)}`;
}

export class SetPieChart extends Component<CardImageProps, CardImageState> {
    constructor(props: CardImageProps) {
        super(props);
        this.state = {hovered: null};
    }

    render(): ReactNode {
        const pieSlices: Data = this.props.data.map((c: PieSlice, i: number) => {
            return {
                cardId: c.cardId,
                tooltip: c.card.name,
                value: c.averageValue,
                color: colors[i % colors.length]
            }
        });
        return <>
            <div data-tip="" data-for="chart">
                <PieChart
                    onClick={(_, index) => {
                        const cardId = pieSlices[index].cardId;
                        const label = `#${cardId} ${(pieSlices[index].tooltip)}`;
                        GoogleAnalytics.event("UserSelect", "PieChart", label);
                        this.props.onChange({value: cardId, label: label});
                    }}
                    data={pieSlices}
                    onMouseOver={(_, index) => this.setState({hovered: index})}
                    onMouseOut={() => this.setState({hovered: null})}
                />
                <ReactTooltip
                    id="chart"
                    getContent={() =>
                        typeof this.state.hovered === "number"
                            ? makeTooltipContent(pieSlices[this.state.hovered]) : null
                    }
                />
            </div>
            <div>
                <strong>Average price:</strong>
                &nbsp;
                {Utils.formatCurrency(this.props.avgCost)}
            </div>
        </>;
    }
}

const colors = [
    "#000000",
    "#808080",
    "#2f4f4f",
    "#556b2f",
    "#8b4513",
    "#6b8e23",
    "#a52a2a",
    "#2e8b57",
    "#228b22",
    "#483d8b",
    "#b8860b",
    "#4682b4",
    "#000080",
    "#d2691e",
    "#9acd32",
    "#20b2aa",
    "#32cd32",
    "#7f007f",
    "#8fbc8f",
    "#b03060",
    "#9932cc",
    "#ff4500",
    "#ffa500",
    "#ffd700",
    "#6a5acd",
    "#ffff00",
    "#deb887",
    "#00ff00",
    "#00fa9a",
    "#dc143c",
    "#00ffff",
    "#00bfff",
    "#f4a460",
    "#0000ff",
    "#a020f0",
    "#f08080",
    "#adff2f",
    "#ff6347",
    "#b0c4de",
    "#ff00ff",
    "#f0e68c",
    "#6495ed",
    "#dda0dd",
    "#90ee90",
    "#ff1493",
    "#afeeee",
    "#ee82ee",
    "#7fffd4",
    "#ff69b4",
    "#ffc0cb",
];
