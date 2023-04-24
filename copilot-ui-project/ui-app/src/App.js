import logo from './logo.svg';
import './App.css';

// use the Button component from 'Button.js'
import Button from './components/Button';
// use the weather widget component from 'WeatherWidget.js'
import WeatherWidget from './components/WeatherWidget';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <Button label="Click me 6 Times" />
        <WeatherWidget />
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Code pilot demo on UI Project
        </a>
      </header>
    </div>
  );
}

export default App;
