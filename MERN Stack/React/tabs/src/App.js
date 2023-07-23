import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Tabs from './components/Tabs';

function App() {
  const [tab, setTab] = useState({
      content: ["Tab 1 content is showing here.", "Tab 2 content is showing here.", "Tab 3 content is showing here."],
      selectedTab: 0, //start from selected index 0 
  })
return (
    <div className="App">
        <Tabs tab={tab} setTab={setTab} />
    </div>
);
}

export default App;