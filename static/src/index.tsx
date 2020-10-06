import * as React from 'react';
import * as ReactDOM from 'react-dom';

import { Page } from './components/Page';

// require("file-loader?name=api/[name].[ext]!./data/data.json");
import "./data/data.json"

ReactDOM.render(
    <Page/>,
    document.getElementById('root')
);