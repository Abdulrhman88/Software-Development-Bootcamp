import React from 'react';
import './App.css';
// import Pokemon from './components/Pokemon'
import PokemonAxios from './components/Pokemon_axios';

function App() {
  return (
    <div className="App">
      <Pokemon />
      <PokemonAxios />
    </div>
  );
}

export default App;