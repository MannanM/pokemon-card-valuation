import React, {Component, ReactNode} from "react";

export class Donate extends Component {
    render(): ReactNode {
        return <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
            <input type="hidden" name="cmd" value="_s-xclick"/>
            <input type="hidden" name="hosted_button_id" value="TKFBQPBUBSXLJ"/>
            <input style={{border: 0}} type="image" src="https://www.paypalobjects.com/en_AU/i/btn/btn_donate_SM.gif"
                   name="submit" title="PayPal - The safer, easier way to pay online!" alt="Donate with PayPal button"/>
            <img alt="" style={{border: 0}} src="https://www.paypal.com/en_AU/i/scr/pixel.gif" width="1" height="1"/>
        </form>
    }
}
