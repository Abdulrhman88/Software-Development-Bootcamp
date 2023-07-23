import React from "react";
import { useParams } from "react-router-dom";

const Word = (props)=>{
    const {word} = useParams();
    return(
        <>
        {
        isNaN(word)?
        <h1>The word is: {word}</h1>: //if the input string print the word is 
        <h1>The Number is: {word}</h1> //else the input intger print the number is 
        }
        </>
    )
}
export default Word;