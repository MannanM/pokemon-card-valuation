import React, { ReactFragment } from "react";
import moment from "moment";
import { TimeRangeEvent, TimeSeries } from "pondjs";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faExternalLinkAlt } from "@fortawesome/free-solid-svg-icons/faExternalLinkAlt";

export class Utils {
    public static getTimeSeries(data: any): TimeSeries {
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

    public static getMinMax(series: TimeSeries): { min: TimeRangeEvent, max: TimeRangeEvent } {
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

    public static formatCurrency(number: Number): String {
        return "$" + number.toFixed(2).replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    }

    public static formatDate(inputDate: Date) {
        return moment(inputDate).format('D/M/YYYY');
    }

    public static formatRelativeDate(inputDate: Date) {
        return moment(inputDate).fromNow();
    }

    public static createLink(itemId: number): ReactFragment {
        return <>
            &nbsp;
            <a href={`https://www.ebay.com.au/itm/${itemId}`} target={'_blank'}>
                <FontAwesomeIcon icon={faExternalLinkAlt}/>
            </a>
        </>;
    }
}
