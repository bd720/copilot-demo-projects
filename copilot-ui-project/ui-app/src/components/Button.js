// create a button react component with Button class

// import react component
import React , {Component} from 'react';
// use the button style class from 'Button.css'
import './Button.css';
class Button extends React.Component {
    // create a constructor to initialize the state with one property 'clickCount'
    constructor(props) {
        super(props);
        this.state = {clickCount: 0};
    }
    //create a onclick method to update the state
    handleClick = () => {
        this.setState({clickCount: this.state.clickCount + 1});
        //log the click count to the console with prefix 'Button clicked'
        console.log('Button clicked ' + this.state.clickCount + ' times');
        // alert user if click count is greater than 5
        // alert user if click count is greater than 3
        /// copilot didn't suggest code against above line with minor change
        if (this.state.clickCount >= 5) {
            alert('You clicked the button more than 5 times');
        }
    }
    render() {
        //bind the click event to the button
        return (
        <button className="button"  
        onClick={this.handleClick}
        >{this.props.label}</button>
        );
    }
    }
    export default Button;