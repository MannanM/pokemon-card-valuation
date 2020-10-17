import React, {Component, ReactNode} from "react";


export class About extends Component {
    render(): ReactNode {

        return <div style={{
            textAlign: 'center',
            fontFamily: 'sans-serif',
            paddingTop: '15px'
        }}>
            <h3>Have you ever wondered what the price of a particular Pokémon card was?</h3>
            This tool looks at the eBay history for Pokémon card so you don't have to!
            <br />
            <br />
            <b style={{color: 'green'}}>
            What this tool will do for you:
            </b>
            <br />
            <br />
            - Only looks at domestic Australian trades
            <br />
            - Will include the postage price so no hidden surprises
            <br />
            - Show you the minimum, maximum, average and median prices
            <br />
            - Plot all sales on a time-series graph
            <br />
            - Clicking a point on the graph will open the eBay listing
            <br />
            <br />
            <b style={{color: 'red'}}>
            What this tool <u>won't</u> do for you (yet):
            </b>
            <br />
            <br />
            - Tell you the price of any graded (e.g. PSA) cards
            <br />
            - Tell you the price of any unopened booster packs, boxes, etc
            <br />
            <br />
            It is also open source, and open to any&nbsp;
            <a href={'https://github.com/MannanM/pokemon-card-valuation/issues/new'}>
                issues, corrections or suggestions
            </a> you might have.
        </div>;
    }
}
