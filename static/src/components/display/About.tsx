import React, { Component, ReactNode } from "react";
import Alert from "react-bootstrap/Alert";
import { LastRefreshed } from "../LastRefreshed";

export class About extends Component {
    render(): ReactNode {

        return <div style={{
            textAlign: 'center',
            paddingTop: '15px'
        }}>
            <h3>Have you ever wondered what the price of a particular Pokémon card was?</h3>
            <p>
                This tool looks at the eBay history for Pokémon card so you don't have to!
            </p>
            <Alert variant="success">
                <Alert.Heading>What this tool will do for you:</Alert.Heading>
                <ul style={{textAlign: "left"}}>
                    <li>
                        Only looks at domestic Australian sold listings for ungraded Pokémon singles.
                    </li>
                    <li>
                        Will include the postage price so no hidden surprises.
                    </li>
                    <li>
                        Show you the minimum, maximum, average and median prices.
                    </li>
                    <li>
                        Plot all sales on a time-series graph with customisable date range.
                    </li>
                </ul>
                <hr/>
                <p className="mb-0">
                    <strong>Tip:</strong> Clicking a point on the graph will open the eBay listing.
                </p>
            </Alert>
            <Alert variant="warning">
                <Alert.Heading>What this tool <u>won't</u> do for you:</Alert.Heading>
                <ul style={{textAlign: "left"}}>
                    <li>
                        Tell you the price of any graded (e.g. PSA) cards.
                    </li>
                    <li>
                        Tell you the price of any unopened booster packs, boxes, etc.
                    </li>
                </ul>
            </Alert>
            <p>
                It is also open source, and open to any&nbsp;
                <a href={'https://github.com/MannanM/pokemon-card-valuation/issues/new'}>
                    issues, corrections or suggestions
                </a> you might have.
            </p>
            <LastRefreshed />
        </div>;
    }
}
