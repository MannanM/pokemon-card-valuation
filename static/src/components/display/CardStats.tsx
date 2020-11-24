import moment from 'moment';
import React, {Component, CSSProperties, ReactNode} from 'react';
import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';
import {faExternalLinkAlt} from '@fortawesome/free-solid-svg-icons'

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
        return <div style={{width: '250px', float: 'right', fontFamily: 'sans-serif'}}>
            <div style={{marginBottom: '15px', fontSize: '24px'}}>
                {this.props.name}
            </div>
            <div>
                <div style={leftCellStyle}>First Auction:</div>
                <div style={cellStyle} title={CardStats.formatDate(this.props.first)}>
                    {CardStats.formatRelativeDate(this.props.first)}
                </div>
            </div>
            <div>
                <div style={leftCellStyle}>Last Auction:</div>
                <div style={cellStyle} title={CardStats.formatDate(this.props.last)}>
                    {CardStats.formatRelativeDate(this.props.last)}
                </div>
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
                <div style={cellStyle}>
                    ${this.props.minPrice.toFixed(2)}
                    {CardStats.createLink(this.props.minId)}
                </div>
            </div>
            <div>
                <div style={leftCellStyle}>Most Expensive:</div>
                <div style={cellStyle}>
                    ${this.props.maxPrice.toFixed(2)}
                    {CardStats.createLink(this.props.maxId)}
                </div>
            </div>
        </div>;
    }

    private static formatDate(inputDate: Date) {
        return moment(inputDate).format('D/M/YYYY');
    }

    private static formatRelativeDate(inputDate: Date) {
        return moment(inputDate).fromNow();
    }

    private static createLink(itemId: number) {
        return <>
            &nbsp;
            <a href={`https://www.ebay.com.au/itm/${itemId}`} target={'_blank'}>
                <FontAwesomeIcon icon={faExternalLinkAlt}/>
            </a>
        </>;
    }
}
