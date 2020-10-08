import React, {Component, ReactNode} from "react";
import {CardSelector} from "./CardSelector";
import {Banner} from "./header/Banner";
import {CardDisplay} from "./display/CardDisplay";
import data from "../data/data";

export class Page extends Component<{}, {}> {
    state = {
        selectedOption: null,
    };

    handleChange = selectedOption => {
        this.setState(
            {selectedOption},
            () => console.log(`Option selected:`, this.state.selectedOption)
        );
    };

    componentDidMount() {
        fetch('/api/data.json')
            .then(response => response.json())
            .then(data => this.setState({data}));
    }

    render(): ReactNode {
        return (
            <React.Fragment>
                <Banner/>
                <div style={{maxWidth: '800px', margin: '0 auto'}}>
                    <CardSelector callback={this.handleChange}/>
                    <CardDisplay card={this.state.selectedOption}
                                 data={data} />
                </div>
            </React.Fragment>
        );
    }
}
