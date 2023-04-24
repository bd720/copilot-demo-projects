//create a weather widget react component with WeatherWidget class
// import react component
import React , {Component} from 'react';
// use the weather widget style class from 'WeatherWidget.css'
import './WeatherWidget.css';
// use axios to make http calls
import axios from 'axios';

class WeatherWidget extends React.Component {
    // create a constructor to initialize the state with three properties 'city', 'temperature' and 'Date'
    constructor(props) {
        super(props);
        this.state = {city: '', temperature: '', Date: ''};
    }
    // create a componentDidMount method to make http call to weather api
    componentDidMount() {
        let api = 'http://localhost:12055/queryByCity/United%20Kingdom'
        // make http call to weather api 
        axios.get(api)
        .then(response => { 
             //log the response data to the console
            console.log(response.data);
            // update the state with the response data
            this.setState({city: response.data.city, temperature: response.data.temperature, Date: response.data.date});
          
        })
        .catch(error => {
            //log the error to the console
            console.log(error);
        });
    }
    //render the weather data from state in a table
    render() {
        //bind the click event to the button
        return (
            <div className="weather-widget">
                <h1>Weather Widget</h1>
                <table>
                    <tr>
                        <td>City</td>
                        <td>Temperature</td>
                        <td>Date</td>
                    </tr>
                    <tr>
                        <td>{this.state.city}</td>
                        <td>{this.state.temperature}</td>
                        <td>{this.state.Date}</td>
                    </tr>
                </table>
            </div>
        );
    }
}

//export 
export default WeatherWidget;