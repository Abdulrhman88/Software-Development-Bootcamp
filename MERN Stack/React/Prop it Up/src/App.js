import React,{Children, Component} from "react";
import SomeClassComponent from './SomeClassComponent'

class App extends React.Component {    
  render() {        
   
    const info1 ={name:"Doe,Janu" ,age:45 , Haricolor:"Black"}
    const info2 ={name:"Smith,John" ,age:88 , Haricolor:"Brown"}
    const info3 ={name:"Fillmore ,Millard" ,age:50 , Haricolor:"Brown"}
    const info4 ={name:"Smith,Maria" ,age:62 , Haricolor:"Brown"}


    return (
        <div>
         <SomeClassComponent person1={info1} person2={info2} person3={info3} person4={info4} />
        </div>   
      );    
  }
}

export default App;
