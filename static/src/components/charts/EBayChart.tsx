import React from 'react';
import moment from 'moment';
import { TimeRange, TimeSeries } from 'pondjs';
import { ChartContainer, ChartRow, Charts, Resizable, ScatterChart, YAxis, } from 'react-timeseries-charts';
import TrendLine from './TrendLine';
import { GoogleAnalytics } from '../../analytics/GoogleAnalytics';
import { faSync } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import Container from "react-bootstrap/Container";
import Col from "react-bootstrap/cjs/Col";
import Row from "react-bootstrap/cjs/Row";

export interface EBayChartProps {
    series: TimeSeries
}

export interface EBayChartState {
    hover: any,
    highlight: any,
    tracker: any,
    timeRange: TimeRange,
}

export class EBayChart extends React.Component<EBayChartProps, EBayChartState> {

    constructor(props: EBayChartProps) {
        super(props);
        this.state = this.calculateState();
    }

    componentDidUpdate(prevProps: Readonly<EBayChartProps>) {
        if (prevProps?.series !== this.props.series) {
            this.setState(this.calculateState());
        }
    }

    private calculateState(): EBayChartState {
        const start = new Date(this.props.series.begin().getTime() - (24 * 60 * 60 * 1000));
        const end = new Date(this.props.series.end().getTime() + (24 * 60 * 60 * 1000));
        return {
            timeRange: new TimeRange(start, end),
            hover: null,
            highlight: null,
            tracker: null
        };
    }

    handleSelectionChanged = point => {
        GoogleAnalytics.event('UserSelect', 'ScatterClick', point.event.get('ebayid'));
        const win = window.open(`https://www.ebay.com.au/itm/${point.event.get('ebayid')}`, '_blank');
        win.focus();
    };

    handleMouseNear = point => {
        this.setState({
            highlight: point
        });
    };

    handleTimeRangeChange = timeRange => {
        this.setState({timeRange});
    };

    reset = e => {
        e.preventDefault();
        this.setState(this.calculateState());
    }

    render() {
        const {text, infoValues} = EBayChart.highlight(this.state.highlight);
        return (
            <Container>
                <Row>
                    <Col>
                        <strong>
                            eBay Auction History
                        </strong>
                    </Col>
                    <Col style={{textAlign: "right"}}>
                        {EBayChart.d(this.state.timeRange.begin())}
                        {' '}to{' '}
                        {EBayChart.d(this.state.timeRange.end())}
                        {' '}
                        <a href={'#reset'} onClick={this.reset}>
                            <FontAwesomeIcon icon={faSync}/>
                        </a>
                    </Col>
                </Row>
                <Row>
                    <Col>
                        <div style={{
                            border: '5px solid #ffe268',
                            padding: '10px',
                            borderRadius: '10px',
                            fontFamily: 'sans-serif',
                            background: 'url(https://png.pngtree.com/thumb_back/fh260/background/20200713/pngtree-old-paper-texture-background-vintage-style-image_352872.jpg) repeat'
                        }}>
                            <div>
                                <Resizable>
                                    <ChartContainer
                                        timeRange={this.state.timeRange}
                                        trackerPosition={this.state.tracker}
                                        maxTime={new Date()}
                                        minTime={this.props.series.begin()}
                                        enablePanZoom={false}
                                        onTrackerChanged={tracker => this.setState({tracker})}
                                        onTimeRangeChanged={this.handleTimeRangeChange}
                                        enableDragZoom={true}
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
                                                max={this.props.series.max('price') + this.props.series.stdev('price', e => e)}
                                                width='70'
                                                type='linear'
                                                format='$,.2f'
                                                // should turn off for low resolutions
                                                visible={true}
                                            />
                                            <Charts>
                                                <ScatterChart
                                                    axis='price-range'
                                                    series={this.props.series}
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
                                                    series={this.props.series}
                                                    range={this.state.timeRange}
                                                />
                                            </Charts>
                                        </ChartRow>
                                    </ChartContainer>
                                </Resizable>
                            </div>
                            <div>{text}</div>
                        </div>
                    </Col>
                </Row>
            </Container>
        );
    }

    private static d(date: Date) {
        return moment(date).format('D/M/YY');
    }

    private static highlight(highlight: any) {
        if (highlight) {
            const priceText = highlight.event.get(highlight.column).toFixed(2);
            return {
                text: `Price $AUD ${priceText} sold at ${EBayChart.d(highlight.event.timestamp())}`,
                infoValues: [{label: '$AUD', value: priceText}]
            };
        } else {
            return {text: '.', infoValues: []};
        }
    }
}
