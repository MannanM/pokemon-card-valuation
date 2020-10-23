import React, {Component, ReactNode} from 'react';

interface CardImageProps {
    cardId: string,
    cardName: string,
    cardSet: string
}

const legacySets = new Map([
    ['BS', 119],
    ['JU', 120],
    ['FO', 121],
    ['TR', 123],
]);

export class CardImage extends Component<CardImageProps> {
    render(): ReactNode {
        const trimLeadingZeros = this.props.cardId.replace(/^0+/, '');
        const url = this.cardUrl(trimLeadingZeros);
        return <img alt={this.props.cardName} src={url} style={{maxHeight: 342}} onError={this.defaultImage}/>;
    }

    private cardUrl(cardId: string) {
        const set = this.props.cardSet == 'BSS' ? 'BS' : this.props.cardSet;
        if (legacySets.has(set)) {
            const cardName = this.props.cardName.split(' ').join('-')
                .replace(/[^0-9a-z_-]/gi, '');
            return `https://pod.pokellector.com/cards/${legacySets.get(set)}/${cardName}.${set}.${cardId}.png`;
        } else {
            return `https://assets.pokemon.com/assets/cms2/img/cards/web/${set}/${set}_EN_${cardId}.png`;
        }
    }

    defaultImage(ev) {
        ev.target.src = 'https://upload.wikimedia.org/wikipedia/en/3/3b/Pokemon_Trading_Card_Game_cardback.jpg'
    }
}
