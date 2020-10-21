import * as React from 'react';
import * as ReactDOM from 'react-dom';

import { Page } from './components/Page';

import './data/sets.json'

for (const set in ['SWSH1', 'SWSH2', 'SWSH3', 'SWSH35', 'XY12']) {
    import(`./img/${set}.png`);
    import(`./data/${set}.json`);
}

ReactDOM.render(
    <Page/>,
    document.getElementById('root')
);