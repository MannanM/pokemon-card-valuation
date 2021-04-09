import React, { Component, CSSProperties, ReactNode } from "react";
import { PieSlice, SetPieChart } from "./SetPieChart";
import { CardData } from "../../data/Api";
import { Utils } from "../../util/Utils";
import { TimeRangeEvent } from "pondjs";
import moment from "moment";

interface SetDisplayProps {
    set: any,
    cards: Map<string, CardData>,
    onChange: (any) => void
}

export class SetDisplay extends Component<SetDisplayProps> {
    constructor(props: SetDisplayProps) {
        super(props);
        this.renderCards = this.renderCards.bind(this);
        this.link = this.link.bind(this);
    }

    render(): ReactNode {
        return <React.Fragment>
            <div style={{
                width: '600px',
                height: '342px',
                margin: '20px auto',
                fontFamily: 'sans-serif'
            }}>
                <div style={{marginBottom: '15px', fontSize: '24px'}}>
                    <img src={`assets/img/${this.props.set.image}`}
                         style={{width: 20, marginRight: 5}}
                         alt={this.props.set.label}
                    />
                    {this.props.set.label} ({this.props.set.value})
                </div>
                {this.props.cards && this.props.cards.size !== 0 && this.renderCards()}
            </div>
        </React.Fragment>;
    }

    private renderCards(): ReactNode {
        const cards = this.props.cards;
        let numberOfCards = 0;

        let maxCardPrice: TimeRangeEvent = null;
        let maxCardId: string = null;

        let totalTradeCount = 0;
        let totalTradeVolume = 0.0;
        let avgCost = 0.0;
        let frequentTradeCount = 0;
        let frequentTradeCardId: string = null;

        let leastTradeCount = 999999;
        let leastTradeCardId: string = null;

        let firstTrade: Date = null;
        let lastTrade: Date = null;

        let data: PieSlice[] = [];

        for (const key in cards) {
            const series = Utils.getTimeSeries(cards[key].data);
            const cardMax = Utils.getMinMax(series).max;

            if (cardMax.get('price') === 0) {
                continue;
            }

            if (maxCardPrice == null || cardMax.get('price') > maxCardPrice.get('price')) {
                maxCardPrice = cardMax;
                maxCardId = key;
            }

            totalTradeCount += series.size();
            if (series.size() > frequentTradeCount) {
                frequentTradeCount = series.size();
                frequentTradeCardId = key;
            } else if (series.size() <= leastTradeCount) {
                leastTradeCount = series.size();
                leastTradeCardId = key;
            }

            if (firstTrade === null || firstTrade > series.begin()) {
                firstTrade = series.begin();
            }

            if (series.end() > lastTrade) {
                lastTrade = series.end();
            }

            totalTradeVolume += series.sum('price', x => x);
            const cardAverage = series.avg('price', x => x);
            data.push({cardId: key, card: cards[key], averageValue: cardAverage});
            avgCost += cardAverage;
            numberOfCards++;
        }

        const dailyTradeVolume = totalTradeVolume / moment(lastTrade).diff(moment(firstTrade), 'days');

        const leftCellStyle: CSSProperties = {width: '180px', float: 'left', marginBottom: '13px', fontWeight: 'bold'};
        const cellStyle: CSSProperties = {width: '200px', float: 'left', marginBottom: '13px'};

        return <React.Fragment>
            <div style={{width: '210px', float: 'left', marginRight: '10px'}}>
                <SetPieChart data={data} avgCost={avgCost} onChange={this.props.onChange} />
            </div>
            <div style={{width: '380px', float: 'left'}}>
                <div>
                    <div style={leftCellStyle}>Cards monitored:</div>
                    <div style={cellStyle}>{numberOfCards}</div>
                </div>
                <div>
                    <div style={leftCellStyle}>Average set price:</div>
                    <div style={cellStyle}>
                        {Utils.formatCurrency(avgCost)}
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Number of trades:</div>
                    <div style={cellStyle}>
                        {totalTradeCount} times
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Total trade volume:</div>
                    <div style={cellStyle}>
                        {Utils.formatCurrency(totalTradeVolume)}
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Most expensive card:</div>
                    <div style={cellStyle}>
                        {this.link(maxCardId)} @ {
                        Utils.formatCurrency(maxCardPrice.get('price'))
                    } {
                        Utils.createLink(maxCardPrice.get('ebayid'))
                    }
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Most traded card:</div>
                    <div style={cellStyle}>
                        {this.link(frequentTradeCardId)} @ {frequentTradeCount} times
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Rarest traded card:</div>
                    <div style={cellStyle}>
                        {this.link(leastTradeCardId)} @ {leastTradeCount} times
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>First recorded trade:</div>
                    <div style={cellStyle} title={Utils.formatDate(firstTrade)}>
                        {Utils.formatRelativeDate(firstTrade)}
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Last recorded trade:</div>
                    <div style={cellStyle} title={Utils.formatDate(lastTrade)}>
                        {Utils.formatRelativeDate(lastTrade)}
                    </div>
                </div>
                <div>
                    <div style={leftCellStyle}>Daily trade volume:</div>
                    <div style={cellStyle}>
                        {Utils.formatCurrency(dailyTradeVolume)}
                    </div>
                </div>
            </div>
        </React.Fragment>
    }

    private link(cardId: string): ReactNode {
        const option = {value: cardId, label: `#${cardId} ${this.props.cards[cardId].name}`};
        return <a href={`#${this.props.set.value}-${cardId}`} onClick={() => this.props.onChange(option)}>
            {this.props.cards[cardId].name}
        </a>
    }
}
