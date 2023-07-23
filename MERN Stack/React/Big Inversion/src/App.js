import logo from './logo.svg';
import './App.css';
import './PersonCard';
import PersonCard from './PersonCard';


function App() {
  return (
    <div className="App">
      
   <PersonCard firstName={"Doe"} lastName={"Janu"} age={ 45 } hairColor={"Brown"} /> 
   <PersonCard firstName={"Smith"} lastName={"John"} age={ 88 } hairColor={"Brown"} /> 
   <PersonCard firstName={"Fillmore"} lastName={"Millard"} age={ 50 } hairColor={"Brown"} /> 
   <PersonCard firstName={"Smith"} lastName={"Maria"} age={ 62 } hairColor={"Brown"} /> 
  
    </div>
  );
}

export default App;
