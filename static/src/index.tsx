import * as React from 'react';
import * as ReactDOM from 'react-dom';

import {Page} from './components/Page';
import {GoogleAnalytics} from './analytics/GoogleAnalytics';

import 'bootstrap/dist/css/bootstrap.min.css';
import './img/favicon.ico';
import './data/sets.json';

[   'SWSH1', 'SWSH2', 'SWSH3', 'SWSH35', 'SWSH4',
    'XY12',
    'SM115', 'SM12',
    'BS', 'BSS', 'JU', 'FO', 'TR'
].forEach(set => {
    import(`./img/${set}.png`);
    import(`./data/${set}.json`);
});

GoogleAnalytics.pageView();

ReactDOM.render(
    <Page/>,
    document.getElementById('root')
);