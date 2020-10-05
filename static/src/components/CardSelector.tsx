import * as React from "react";
import Select from 'react-select';
import data from "../data/data";

interface CardSelectorProps {
    callback: (selectedOption) => void
}

export class CardSelector extends React.Component<CardSelectorProps> {
    state = {
        selectedOption: null,
    };

    handleChange = selectedOption => {
        this.setState(
            { selectedOption },
            () => console.log(`Option selected:`, this.state.selectedOption)
        );
        this.props.callback(selectedOption)
    };

    render() {
        const { selectedOption } = this.state;

        return (
            <Select
                value={selectedOption}
                onChange={this.handleChange}
                options={data.cardList}
            />
        );
    }
}
