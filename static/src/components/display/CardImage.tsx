import React, {Component, ReactNode} from "react";

interface CardImageProps {
    cardId: string,
    cardName: string,
    cardSet: string
}

export class CardImage extends Component<CardImageProps> {
    render(): ReactNode {
        const trimLeadingZeros = this.props.cardId.replace(/^0+/, '');
        const url = `https://assets.pokemon.com/assets/cms2/img/cards/web/${this.props.cardSet}/${this.props.cardSet}_EN_${trimLeadingZeros}.png`;
        return <img alt={this.props.cardName} src={url} />;
    }
}
