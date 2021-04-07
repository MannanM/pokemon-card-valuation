import React, {Component, ReactNode} from 'react';
import {CardImage} from './CardImage';
import {EBayChart} from '../charts/EBayChart';
import {CardStats} from './CardStats';
import {CardData} from '../../data/Api';
import {Utils} from '../../util/Utils';

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
                    average={series.avg('price', (e) => e)}
                />
            </div>
            <EBayChart series={series}/>
        </React.Fragment>;
    }
}
