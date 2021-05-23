import React, {Component, ReactNode} from 'react';
import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";
import { faCode } from "@fortawesome/free-solid-svg-icons/faCode";
import { faDonate } from "@fortawesome/free-solid-svg-icons/faDonate";
import { faInbox } from "@fortawesome/free-solid-svg-icons/faInbox";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

export class Banner extends Component {
    render(): ReactNode {
        return <Navbar bg="light" expand="md">
            <Navbar.Brand href="/">Pokémon Card Valuation Tool</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="ml-auto">
                    <Nav.Link href="https://github.com/MannanM/pokemon-card-valuation">
                        <FontAwesomeIcon icon={faCode} style={{marginRight: '5px'}}/>
                        Source Code
                    </Nav.Link>
                    <Nav.Link href="https://www.buymeacoffee.com/MannanM">
                        <FontAwesomeIcon icon={faDonate} style={{marginRight: '5px'}}/>
                        Support
                    </Nav.Link>
                    <Nav.Link href="https://github.com/MannanM/pokemon-card-valuation/issues/new">
                        <FontAwesomeIcon icon={faInbox} style={{marginRight: '5px'}}/>
                        Contact
                    </Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    }
}
