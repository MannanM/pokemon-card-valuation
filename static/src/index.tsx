import * as React from 'react';
import * as ReactDOM from 'react-dom';

import { Page } from './components/Page';

import "./data/sets.json"
import "./data/SWSH1.json"
import "./data/SWSH2.json"
import "./data/SWSH3.json"
import "./data/SWSH35.json"

import "./img/SWSH1.png"
import "./img/SWSH2.png"
import "./img/SWSH3.png"
import "./img/SWSH35.png"

ReactDOM.render(
    <Page/>,
    document.getElementById('root')
);