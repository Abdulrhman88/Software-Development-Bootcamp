// import { Router } from '@reach/router';

import {BrowserRouter, Switch, Route} from "react-router-dom"
import Home from './components/Home';
import Color from './components/Color';
import Word from './components/Word';


function App() {
return (
	<div className="App">
	<BrowserRouter>
	<Switch>

	  <Route path="/home">
		<Home/>
	  </Route>

	  <Route exact path="/:word">
		<Word/>
	  </Route>

	  <Route path="/:word/:tColor/:bColor"> 
		<Color/>
	  </Route>

	</Switch>
	</BrowserRouter>
  </div>
);
}

export default App;