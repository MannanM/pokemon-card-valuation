import React, { Component, ReactNode } from "react";

import Container from "react-bootstrap/Container";
import Col from "react-bootstrap/Col";
import { TimeRangeEvent } from "pondjs";
import moment from "moment";

import Row from "react-bootstrap/Row";
import { PieSlice, SetPieChart } from "../charts/SetPieChart";
import { CardData } from "../../data/Api";
import { Utils } from "../../util/Utils";
import { DateTooltip } from "../../util/DateTooltip";

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
        return <Container>
            <Row className={'mt-2 d-none d-sm-block'}>
                <Col>
                    <h3>
                        <img src={`assets/img/${this.props.set.image}`}
                             style={{width: 20, marginRight: 5}}
                             alt={this.props.set.label}
                        />
                        {this.props.set.label} ({this.props.set.value})
                    </h3>
                </Col>
            </Row>
            {this.props.cards && this.props.cards.size !== 0 && this.renderCards()}
        </Container>;
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

        return <Row>
            <Col md={{span: 6}} className={'mt-2'}>
                <SetPieChart data={data} avgCost={avgCost} onChange={this.props.onChange}/>
            </Col>
            <Col className={'mt-2'}>
                <Row>
                    <Col><strong>Cards monitored:</strong></Col>
                    <Col>{numberOfCards}</Col>
                </Row>
                <Row>
                    <Col><strong>Average set price:</strong></Col>
                    <Col>
                        {Utils.formatCurrency(avgCost)}
                    </Col>
                </Row>
                <Row>
                    <Col><strong>Number of trades:</strong></Col>
                    <Col>
                        {totalTradeCount} times
                    </Col>
                </Row>
                <Row>
                    <Col><strong>Total trades:</strong></Col>
                    <Col>
                        {Utils.formatCurrency(totalTradeVolume)}
                    </Col>
                </Row>
                {maxCardId &&
                <Row>
                    <Col><strong>Most expensive:</strong></Col>
                    <Col>
                        {this.link(maxCardId)} @ {
                        Utils.formatCurrency(maxCardPrice.get('price'))
                    } {
                        Utils.createLink(maxCardPrice.get('ebayid'))
                    }
                    </Col>
                </Row>
                }
                {frequentTradeCardId &&
                <Row>
                    <Col><strong>Most traded card:</strong></Col>
                    <Col>
                        {this.link(frequentTradeCardId)} @ {frequentTradeCount} times
                    </Col>
                </Row>
                }
                {leastTradeCardId &&
                <Row>
                    <Col><strong>Rarest card:</strong></Col>
                    <Col>
                        {this.link(leastTradeCardId)} @ {leastTradeCount} times
                    </Col>
                </Row>
                }
                <Row>
                    <Col><strong>First trade:</strong></Col>
                    <Col>
                        <DateTooltip when={firstTrade} />
                    </Col>
                </Row>
                <Row>
                    <Col><strong>Last trade:</strong></Col>
                    <Col>
                        <DateTooltip when={lastTrade} />
                    </Col>
                </Row>
                <Row>
                    <Col><strong>Daily trade:</strong></Col>
                    <Col>
                        {Utils.formatCurrency(dailyTradeVolume)}
                    </Col>
                </Row>
            </Col>
        </Row>
    }

    private link(cardId: string): ReactNode {
        const option = {value: cardId, label: `#${cardId} ${this.props.cards[cardId].name}`};
        return <a href={`#${this.props.set.value}-${cardId}`} onClick={() => this.props.onChange(option)}>
            {this.props.cards[cardId].name}
        </a>
    }
}
