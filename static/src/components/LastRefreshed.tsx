import React, {Component, ReactNode} from 'react';
import { DateTooltip } from "../util/DateTooltip";

export class LastRefreshed extends Component {
    render(): ReactNode {
        return <span className={'text-secondary'}>
            <strong>Last Refreshed:</strong>
            <DateTooltip when={new Date(process.env.BUILD_TIME)} />
        </span>
    }
}
