import React, { Component, ReactNode } from 'react';
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Container from "react-bootstrap/Container";
import { CardImage } from './CardImage';
import { EBayChart } from '../charts/EBayChart';
import { CardStats } from './CardStats';
import { CardData } from '../../data/Api';
import { Utils } from '../../util/Utils';

interface CardDisplayProps {
    cardSet: string,
    cardId: string,
    card: CardData
}

export class CardDisplay extends Component<CardDisplayProps> {
    constructor(props: CardDisplayProps) {
        super(props);
    }

    render(): ReactNode {
        const series = Utils.getTimeSeries(this.props.card.data);
        const minMax = Utils.getMinMax(series);

        return <Container>
            <Row>
                <Col sm={{span: 6}} lg={{offset: 2, span: 4}} className={'mt-2'}>
                    <CardStats
                        name={this.props.card.name}
                        first={series.begin()}
                        last={series.end()}
                        times={this.props.card.data.length}
                        minPrice={minMax.min.get('price')}
                        minId={minMax.min.get('ebayid')}
                        maxPrice={minMax.max.get('price')}
                        maxId={minMax.max.get('ebayid')}
                        average={series.avg('price', (e) => e)}
                    />
                </Col>
                <Col md={{span: 6}} sm={{span: 6}} style={{textAlign: 'center'}} className={'mt-2'}>
                    <CardImage cardId={this.props.cardId} cardName={this.props.card.name} cardSet={this.props.cardSet}/>
                </Col>
            </Row>
            <Row className={'mt-2'}>
                <Col>
                    <EBayChart series={series}/>
                </Col>
            </Row>

        </Container>;
    }
}
