//import react router dom
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
//create a react router component
function Routes() {
    return (
        <Router>
        <Switch>
            <Route exact path="/">
            <Home />
            </Route>
            <Route path="/about">
            <About />
            </Route>
            <Route path="/users">
            <Users />
            </Route>
        </Switch>
        </Router>
    );
    }
    export default Routes;