import React, {Component, ReactNode} from 'react';
import {Donate} from './Donate';

export class Banner extends Component {
    render(): ReactNode {
        return <nav style={{
            height: '60px',
            backgroundColor: '#000',
            boxShadow: '0 4px 4px rgba(0,0,0,.25)',
            marginBottom: '15px',
            padding: '0 20px'
        }}>
            <div style={{
                float: 'left',
                color: '#fff',
                fontFamily: 'sans-serif'
            }}>
                <h1>
                    Pokemon Card Valuation Tool
                </h1>
            </div>
            <div style={{float:'right', paddingTop: '20px'}}>
                <Donate />
            </div>
            <div style={{float:'right', paddingTop: '16px', paddingRight: '5px'}}>
                <a className='github-button'
                   href='https://github.com/MannanM/pokemon-card-valuation'
                   data-size='large'
                   aria-label='Star MannanM/pokemon-card-valuation on GitHub'>
                    Source
                </a>
            </div>
        </nav>
    }
}
