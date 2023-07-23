import React , {useState} from "react";

const BoxGnarate = (props) => {
    const [color,setColor] = useState("");
    const [boxes,setBoxes] = useState([]);


const creeateBox = (e) => {
    e.preventDefault();
    let box =
        <div style={{backgroundColor: color}}> {color} </div>; 
    setBoxes([...boxes,box]);
}
return(
    <div>
        <form onSubmit={creeateBox}>
            <label>Color</label>
            <input type="text"  onChange={(e) => {setColor(e.target.value)}}/>

        </form>
       
        {boxes}
            
    </div>
)
}
export default BoxGnarate;