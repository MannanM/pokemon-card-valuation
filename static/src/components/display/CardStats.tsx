import React, { Component, ReactNode } from 'react';

import Col from "react-bootstrap/Col";
import Row from "react-bootstrap/Row";
import Container from "react-bootstrap/Container";

import { Utils } from '../../util/Utils';
import { DateTooltip } from "../../util/DateTooltip";

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
        return <Container>
            <Row className={'d-none d-sm-block'}>
                <Col>
                    <h3>
                        {this.props.name}
                    </h3>
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>
                        First Auction:
                    </strong>
                </Col>
                <Col>
                    <DateTooltip when={this.props.first} />
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>
                        Last Auction:
                    </strong>
                </Col>
                <Col>
                    <DateTooltip when={this.props.last} />
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>
                        Auctioned:
                    </strong>
                </Col>
                <Col>
                    {this.props.times} times
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>Average Price:</strong>
                </Col>
                <Col>
                    ${this.props.average.toFixed(2)}
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>Cheapest:</strong>
                </Col>
                <Col>
                    ${this.props.minPrice.toFixed(2)}
                    {Utils.createLink(this.props.minId)}
                </Col>
            </Row>
            <Row>
                <Col>
                    <strong>Most Expensive:</strong>
                </Col>
                <Col>
                    ${this.props.maxPrice.toFixed(2)}
                    {Utils.createLink(this.props.maxId)}
                </Col>
            </Row>
        </Container>;
    }
}
