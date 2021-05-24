import React, { Component, ReactNode } from 'react';

import OverlayTrigger from "react-bootstrap/OverlayTrigger";
import Tooltip from "react-bootstrap/Tooltip";
import moment from "moment";

import { Utils } from "./Utils";

interface DateTooltipProps {
    when: Date
}

export class DateTooltip extends Component<DateTooltipProps> {
    render(): ReactNode {
        return <OverlayTrigger placement="top" overlay={
            <Tooltip id={`tooltip-${this.props.when}`}>
                {
                    moment(this.props.when).format('D/M/YYYY h:mm a')
                }
            </Tooltip>
        }>
            <span style={{textDecorationLine: 'underline'}}>
                {Utils.formatRelativeDate(this.props.when)}
            </span>
        </OverlayTrigger>
    }
}
