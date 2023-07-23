import React from 'react';
//import './App.css'
import Wrapper from './components/Wrapper';
import Navbar from './components/Navbar';
import FormWrapper from './components/FormWrapper';

const App = () => {
  return (
    <div className="App">
      <Wrapper>
        <Navbar/>
        <FormWrapper/>
      </Wrapper>
    </div>
  );
}

export default App;