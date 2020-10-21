import React from 'react';
import moment from 'moment';
import {TimeRange, TimeSeries} from 'pondjs';
import {
    ChartContainer,
    ChartRow,
    Charts,
    Resizable,
    ScatterChart,
    YAxis,
} from 'react-timeseries-charts';
import TrendLine from './TrendLine';
import {GoogleAnalytics} from '../../analytics/GoogleAnalytics';

export interface EBayChartProps {
    series: TimeSeries
}

export interface EBayChartState {
    hover: any,
    highlight: any,
    tracker: any
}

export class EBayChart extends React.Component<EBayChartProps, EBayChartState> {
    state = {
        hover: null,
        highlight: null,
        tracker: null
    };

    handleSelectionChanged = point => {
        GoogleAnalytics.event('eBay', 'open', point.event.get('ebayid'));
        const win = window.open(`https://www.ebay.com.au/itm/${point.event.get('ebayid')}`, '_blank');
        win.focus();
    };

    handleMouseNear = point => {
        this.setState({
            highlight: point
        });
    };

    render() {
        const series = this.props.series;
        const start = new Date(series.begin().getTime() - (24 * 60 * 60 * 1000));
        const end = new Date(series.end().getTime() + (24 * 60 * 60 * 1000));
        const highlight = this.state.highlight;
        let text = '.';
        let infoValues = [];
        if (highlight) {
            const priceText = `${highlight.event.get(highlight.column).toFixed(2)}`;
            text = `Price $AUD ${priceText} sold at
                ${moment(this.state.highlight.event.timestamp()).format('LLL')} 
            `;
            infoValues = [{label: '$AUD', value: priceText}];
        }

        return (
            <div style={{
                border: '15px solid #ffe268',
                padding: '10px',
                borderRadius: '10px',
                fontFamily: 'sans-serif',
                background: 'url(https://png.pngtree.com/thumb_back/fh260/background/20200713/pngtree-old-paper-texture-background-vintage-style-image_352872.jpg) repeat'
            }}>
                <div style={{paddingBottom: '10px'}}>
                    eBay Auction History
                </div>
                <div>
                    <Resizable>
                        <ChartContainer
                            timeRange={new TimeRange(start, end)}
                            trackerPosition={this.state.tracker}
                            maxTime={start}
                            minTime={end}
                            enablePanZoom={false}
                            onTrackerChanged={tracker => this.setState({tracker})}
                        >
                            <ChartRow
                                height='150'
                                trackerInfoValues={infoValues}
                            >
                                <YAxis
                                    id='price-range'
                                    label='Sold $AUD'
                                    labelOffset={-5}
                                    min={0}
                                    max={series.max('price') + series.stdev('price', e => e)}
                                    width='70'
                                    type='linear'
                                    format='$,.2f'
                                />
                                <Charts>
                                    <ScatterChart
                                        axis='price-range'
                                        series={series}
                                        columns={['price']}
                                        format='.2f'
                                        selected={null}
                                        onSelectionChange={p => this.handleSelectionChanged(p)}
                                        onMouseNear={p => this.handleMouseNear(p)}
                                        highlight={this.state.highlight}
                                        radius={5}
                                    />

                                    <TrendLine
                                        axis='price-range'
                                        column={'price'}
                                        series={series}
                                    />

                                </Charts>
                            </ChartRow>
                        </ChartContainer>
                    </Resizable>
                </div>
                <div>{text}</div>
            </div>
        );
    }
}
