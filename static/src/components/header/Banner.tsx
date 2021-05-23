import React, {Component, ReactNode} from 'react';
import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";

export class Banner extends Component {
    render(): ReactNode {
        return <Navbar bg="light" expand="md">
            <Navbar.Brand href="/">Pokémon Card Valuation Tool</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="mr-auto">
                    <Nav.Link href="https://github.com/MannanM/pokemon-card-valuation">Source Code</Nav.Link>
                    <Nav.Link href="https://www.buymeacoffee.com/MannanM">Support</Nav.Link>
                    <Nav.Link href="https://github.com/MannanM/pokemon-card-valuation/issues/new">Contact</Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    }
}
