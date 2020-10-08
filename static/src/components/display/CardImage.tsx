import React, {Component, ReactNode} from "react";

interface CardImageProps {
    card: any
}

export class CardImage extends Component<CardImageProps> {
    render(): ReactNode {
        if (!this.props.card) {
            return <React.Fragment />;
        }
        const trimLeadingZeros = this.props.card.value.replace(/^0+/, '');
        const url = `https://assets.pokemon.com/assets/cms2/img/cards/web/SWSH1/SWSH1_EN_${trimLeadingZeros}.png`;
        return <img alt={this.props.card.label} src={url} />;
    }
}
