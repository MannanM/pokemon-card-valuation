import React, {Component, ReactNode} from 'react';
import {TimeRangeEvent, TimeSeries} from 'pondjs';
import {CardImage} from './CardImage';
import {EBayChart} from '../charts/EBayChart';
import {CardStats} from './CardStats';
import {CardData} from '../../data/Api';

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
        const series = this.getTimeSeries(this.props.card.data);
        const minMax = this.getMinMax(series);

        return <React.Fragment>
            <div style={{width: '600px', height: '342px', margin: '20px auto'}}>
                <CardImage cardId={this.props.cardId} cardName={this.props.card.name} cardSet={this.props.cardSet}/>
                <CardStats
                    name={this.props.card.name}
                    first={series.begin()}
                    last={series.end()}
                    times={this.props.card.data.length}
                    minPrice={minMax.min.get('price')}
                    minId={minMax.min.get('ebayid')}
                    maxPrice={minMax.max.get('price')}
                    maxId={minMax.max.get('ebayid')}
                    median={series.median('price', (e) => e)}
                />
            </div>
            <EBayChart series={series}/>
        </React.Fragment>;
    }

    private getTimeSeries(data: any): TimeSeries {
        const points = data.length ? data.map(([date, value, id]) => [
            new Date(date),
            value,
            id
        ]) : [[new Date(), 0, 0]];
        return new TimeSeries({
            name: 'ebay-sold-price',
            columns: ['time', 'price', 'ebayid'],
            points: points
        });
    }

    private getMinMax(series: TimeSeries): { min: TimeRangeEvent, max: TimeRangeEvent } {
        let min = null;
        let max = null;
        series.map(e => {
            if (min === null) {
                min = e;
                max = e;
            } else if (e.get('price') > max.get('price')) {
                max = e;
            } else if (e.get('price') < min.get('price')) {
                min = e;
            }
            return e;
        });
        return {min: min, max: max}
    }
}
