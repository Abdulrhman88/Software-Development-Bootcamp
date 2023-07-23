import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import Main from './views/Main'
import Authorsupdate from './components/Authorsupdate';
function App() {
  return (
    <BrowserRouter>
    <div className="App">
      <Switch>
        <Route path="/auhors/edit/:id">
          <Authorsupdate/>
        </Route>
      <Route path="/create/authors">

        <Main/>

      </Route>
      </Switch>
    </div>
    </BrowserRouter>
  );
}

export default App;
