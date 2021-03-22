import React, {Component, ReactNode} from "react";

export class Donate extends Component {
    render(): ReactNode {
        return <a href="https://www.buymeacoffee.com/MannanM" target="_blank">
                <img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png"
                     alt="Buy Me A Coffee"
                     style={{"height": 50, "width": 190, "marginTop": -15}}
                />
            </a>
    }
}
