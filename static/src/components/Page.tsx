import React, {Component, ReactNode} from "react";
import {CardSelector} from "./CardSelector";
import {Banner} from "./header/Banner";
import {About} from "./display/About";
import {SetDisplay} from "./display/SetDisplay";
import {CardDisplay} from "./display/CardDisplay";
import {Api, CardData, Expansion} from "../data/Api";
import {GoogleAnalytics} from "../analytics/GoogleAnalytics";

interface PageState {
    selectedOption: any,
    selectedSet: any,
    cards: Map<string, CardData>,
    expansions: Expansion[],
    defaultSet: string,
    defaultCard: string,
}

export class Page extends Component<{}, PageState> {
    private api: Api = new Api()

    constructor(props: {}) {
        super(props);
        //set the page hash only once, when the page is constructed
        const pageHash = window.location.hash.substr(1).split('-');
        this.state = {
            selectedOption: null,
            selectedSet: null,
            cards: new Map<string, CardData>(),
            expansions: [],
            defaultSet: pageHash[0],
            defaultCard: pageHash.length > 1 ? pageHash[1] : ''
        };
    }

    handleChange = selectedOption => {
        this.setState(
            {
                defaultCard: selectedOption == null ? '' : selectedOption.value,
                selectedOption: selectedOption
            },
            () => {
                console.log(`Card selected:`, this.state.selectedOption);
            }
        );
        Page.setHash(this.state.selectedSet, selectedOption);
    };

    handleSetChange = selectedSet => {
        //clear the state so the card drop down can clear
        this.setState(
            {
                selectedSet: null,
                selectedOption: null,
                cards: new Map<string, CardData>()
            },
            () => {
                Page.setHash(selectedSet, null);
                this.setState({
                    defaultSet: selectedSet == null ? '' : selectedSet.value,
                    // defaultCard: '',
                    selectedSet: selectedSet
                });
                if (selectedSet) {
                    this.api.fetchCards(selectedSet.value)
                        .then(data => this.setState({cards: data}));
                }
            }
        );
    };

    private static setHash(selectedSet, selectedCard) {
        console.log(`Selected: ${selectedSet?.value} ${selectedCard?.value}`);
        if (selectedSet?.value) {
            if (selectedCard?.value) {
                GoogleAnalytics.event('UserSelect', 'Card', selectedSet.value + '-' + selectedCard.value);
                window.location.hash = selectedSet.value + '-' + selectedCard.value;
            } else {
                GoogleAnalytics.event('UserSelect', 'Set', selectedSet.value);
                window.location.hash = selectedSet.value;
            }
        } else {
            window.location.hash = '';
        }
    }

    componentDidMount() {
        this.api.getExpansions().then(data => this.setState({expansions: data}));
    }

    render(): ReactNode {
        const setOptions = this.state.expansions.map(expansion => {
            return {
                label: expansion.name,
                options: expansion.sets.map(set => {
                    return {
                        value: set.value,
                        label: set.name,
                        image: `${set.value}.png`
                    }
                })
            }
        });
        const options = Object.keys(this.state.cards).map(key => {
            return {value: key, label: `#${key} ${this.state.cards[key].name}`}
        }).sort((c1, c2) => c1.value > c2.value ? 1 : -1);

        //don't set the default card if it's from a different set
        const defaultCard = this.state.selectedSet?.value === this.state.defaultSet ? this.state.defaultCard : '';
        return (
            <React.Fragment>
                <Banner/>
                <div style={{maxWidth: '800px', margin: '0 auto'}}>
                    <CardSelector
                        callback={this.handleSetChange}
                        options={setOptions}
                        placeholder={'Select set...'}
                        defaultValue={this.state.defaultSet}
                    />
                    {
                        this.state.selectedSet &&
                        <CardSelector
                            callback={this.handleChange}
                            options={options}
                            placeholder={'Select card...'}
                            defaultValue={defaultCard}
                        />
                    }
                    {
                        !this.state.selectedOption && this.state.selectedSet && <SetDisplay
                            set={this.state.selectedSet} cards={this.state.cards} onChange={this.handleChange}/>
                    }
                    {
                        !this.state.selectedOption && !this.state.selectedSet && <About/>
                    }
                    {
                        this.state.selectedOption &&
                        <CardDisplay
                            cardSet={this.state.selectedSet.value}
                            cardId={this.state.selectedOption.value}
                            card={this.state.cards[this.state.selectedOption.value]}
                        />
                    }
                </div>
            </React.Fragment>
        );
    }
}
