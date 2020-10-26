import moment from "moment";
import React, {Component, CSSProperties, ReactNode} from "react";

interface CardStatsProps {
    name: string,
    first: Date,
    last: Date,
    times: number,
    minPrice: number,
    minId: number,
    maxPrice: number,
    maxId: number,
    average: number
}

export class CardStats extends Component<CardStatsProps> {
    render(): ReactNode {
        const leftCellStyle : CSSProperties = {width: '150px', float: 'left', marginBottom: '13px', fontWeight: 'bold'};
        const cellStyle : CSSProperties = {width: '100px', float: 'left', marginBottom: '13px'};
        return <div style={{width: '250px', float: "right", fontFamily: 'sans-serif'}}>
            <div style={{marginBottom: '15px', fontSize: '24px'}}>
                {this.props.name}
            </div>
            <div>
                <div style={leftCellStyle}>First Auction:</div>
                <div style={cellStyle}>{moment(this.props.first).format('l')}</div>
            </div>
            <div>
                <div style={leftCellStyle}>Last Auction:</div>
                <div style={cellStyle}>{moment(this.props.last).format('l')}</div>
            </div>
            <div>
                <div style={leftCellStyle}>Times Auctioned:</div>
                <div style={cellStyle}>{this.props.times}</div>
            </div>
            <div>
                <div style={leftCellStyle}>Average Price:</div>
                <div style={cellStyle}>${this.props.average.toFixed(2)}</div>
            </div>
            <div>
                <div style={leftCellStyle}>Cheapest:</div>
                <div style={cellStyle}>${this.props.minPrice.toFixed(2)}</div>
            </div>
            <div>
                <div style={leftCellStyle}>Most Expensive:</div>
                <div style={cellStyle}>${this.props.maxPrice.toFixed(2)}</div>
            </div>
        </div>;
    }
}
