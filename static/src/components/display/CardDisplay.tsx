import React, {Component, ReactNode} from 'react';
import {TimeRangeEvent, TimeSeries} from 'pondjs';
import {CardImage} from './CardImage';
import {EBayChart2} from './EBayChart2';
import {CardStats} from './CardStats';

interface CardDisplayProps {
    card: any,
    data: any
}

interface CardDisplayState {
}

export class CardDisplay extends Component<CardDisplayProps, CardDisplayState> {
    constructor(props: CardDisplayProps) {
        super(props);
    }

    render(): ReactNode {
        if (this.props.card?.value) {
            const series = this.getTimeSeries();
            const minMax = this.getMinMax(series);

            return <React.Fragment>
                <div style={{width: '600px', margin: '20px auto'}}>
                    <CardImage card={this.props.card}/>
                    <CardStats
                        name={this.props.card.label}
                        first={series.begin()}
                        last={series.end()}
                        times={series.count()}
                        minPrice={minMax.min.get('price')}
                        minId={minMax.min.get('ebayid')}
                        maxPrice={minMax.max.get('price')}
                        maxId={minMax.max.get('ebayid')}
                        median={series.median('price', (e) => e)}
                    />
                </div>
                <EBayChart2 series={series}/>
            </React.Fragment>;
        } else {
            return <React.Fragment/>;
        }
    }

    private getTimeSeries(): TimeSeries {
        return new TimeSeries({
            name: 'ebay-sold-price',
            columns: ['time', 'price', 'ebayid'],
            points: this.props.data[this.props.card.value].map(([date, value, id]) => [
                new Date(date),
                value,
                id
            ])
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
