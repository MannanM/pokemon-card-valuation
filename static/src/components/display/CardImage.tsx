import React, {Component, ReactNode} from "react";

interface CardImageProps {
    cardId: string,
    cardName: string,
    cardSet: string
}

export class CardImage extends Component<CardImageProps> {
    render(): ReactNode {
        const trimLeadingZeros = this.props.cardId.replace(/^0+/, '');
        const url = this.cardUrl(trimLeadingZeros);
        return <img alt={this.props.cardName} src={url} style={{maxHeight: 342}}/>;
    }

    private cardUrl(cardId: string) {
        if (this.props.cardSet.startsWith('BS')) {
            return `https://pod.pokellector.com/cards/119/${this.props.cardName.split(' ').join('-')}.BS.${cardId}.png`;
        } else {
            return `https://assets.pokemon.com/assets/cms2/img/cards/web/${this.props.cardSet}/${this.props.cardSet}_EN_${cardId}.png`;
        }
    }
}
