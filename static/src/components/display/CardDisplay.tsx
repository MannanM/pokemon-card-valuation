import React, {Component, ReactNode} from "react";
import {CardImage} from "./CardImage";
import {EBayChart2} from "./EBayChart2";

interface CardDisplayProps {
    card: any,
    data: any
}

export class CardDisplay extends Component<CardDisplayProps> {
    render(): ReactNode {
        if (this.props.card?.value) {
            return <React.Fragment>
                <br/>
                <br/>
                <CardImage card={this.props.card}/>
                <br/>
                <br/>
                <EBayChart2 data={this.props.data[this.props.card.value]}/>
            </React.Fragment>;
        } else {
            return <React.Fragment />;
        }
    }
}
