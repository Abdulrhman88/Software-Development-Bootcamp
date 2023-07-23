import React, { Component } from 'react';
    
    
class SomeClassComponent extends React.Component {
render() {
    return (
        <div>
            
           <h1>{this.props.person1.name}</h1>
           <p>Age : {this.props.person1.age}</p>
           <p>Hair Color :{this.props.person1.Haricolor} </p>

            
           <h1>{this.props.person2.name}</h1>
           <p>Age : {this.props.person2.age}</p>
           <p>Hair Color :{this.props.person2.Haricolor} </p>

           
           <h1>{this.props.person3.name}</h1>
           <p>Age : {this.props.person3.age}</p>
           <p>Hair Color :{this.props.person3.Haricolor} </p>

           
           <h1>{this.props.person4.name}</h1>
           <p>Age : {this.props.person4.age}</p>
           <p>Hair Color :{this.props.person4.Haricolor} </p>
        </div>
    )
}
}
    
export default SomeClassComponent;
