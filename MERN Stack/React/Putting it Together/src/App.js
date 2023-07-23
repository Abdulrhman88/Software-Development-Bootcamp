import React,{Children, Component} from "react";

class App extends Component { 
  constructor(props){
    super(props);
    this.state={
      age1:45,
      age2:88
    }
  }
  changeage1=()=>{
    this.setState({age:this.state.age1+=1})
  }
  changeage2=()=>{
    this.setState({age:this.state.age2+=1})
  }  

  render() {        
   
    
    return (
        <div>
           <h1>Doe, Jane</h1>
            <p>Age: {this.state.age1}</p>
            <button onClick={this.changeage1}>Birthday Button</button>

          
            <h1>Smith, John</h1>
            <p>Age: {this.state.age2}</p>
            <button onClick={this.changeage2}>Birthday Button</button>
    
            
        </div>   
      );    
  }
}

export default App;
