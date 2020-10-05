import React, {Component, ReactNode} from "react";
import {EBayChart} from "./EBayChart";
import {CardSelector} from "./CardSelector";
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
            <html lang="en">
            <head>
                <meta charSet="utf-8"/>
                <title>Hello world</title>
            </head>
            <body>
            <CardSelector callback={this.handleChange}/>
            <br/>
            <br/>
            {this.state.selectedOption && <EBayChart data={data[this.state.selectedOption.value]}/>}
            <br/>
            <br/>
            <CardImage card={this.state.selectedOption}/>
            </body>
            </html>
        );
    }
}
