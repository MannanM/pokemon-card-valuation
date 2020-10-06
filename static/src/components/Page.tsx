import React, {Component, ReactNode} from "react";
import {EBayChart} from "./EBayChart";
import {EBayChart2} from "./EBayChart2";
import {CardSelector} from "./CardSelector";
import {Banner} from "./header/Banner";
import {CardImage} from "./CardImage";
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
        fetch('foo.json')
            .then(response => response.json())
            .then(data => this.setState({data}));
    }

    render(): ReactNode {
        return (
            <React.Fragment>
                <Banner/>
                <div style={{maxWidth: '800px', margin: '0 auto'}}>
                    <CardSelector callback={this.handleChange}/>
                    <br/>
                    <br/>
                    <CardImage card={this.state.selectedOption}/>
                    <br/>
                    <br/>
                    {this.state.selectedOption && <EBayChart2 data={data[this.state.selectedOption.value]}/>}
                </div>
            </React.Fragment>
        );
    }
}
