import {BrowserRouter,Switch,Route} from "react-router-dom";
import Main from './views/Main';
import Update from './components/UpdateProductForm'; 
import ProudcutDetails from "./components/ProudcutDetails";
function App() {
  return (
<BrowserRouter>
    <div className='App'>
      <Switch>
      <Route path='/prodect/edit/:_id'>
          <Update/>
        </Route>

        <Route path='/prodect/:id'>
          <ProudcutDetails/>
        </Route>

        <Route path="/new/prodect">
          <Main/>
        </Route>

      </Switch>
    </div>
</BrowserRouter>
  );
}

export default App;
