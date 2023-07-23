import React, { useState } from 'react'
import axios from 'axios'
export default  () => {
   
    const [name, setname] = useState("");  
    const[error, setError] = useState([])
    const [nameError, setNameError] = useState(""); 
  
    const onSubmitHandler = e => {
        e.preventDefault();
        
        axios.post('http://localhost:8000/create/authors', {name})
            .then(res=>console.log(res))
            .catch(err=> {
                const errorObj = err.response.data.errors
                let errArr = []
                for (const key of Object.keys(errorObj)){
                    errArr.push(errorObj[key].message)
                }
                setError(errArr)
            })
    }

    const handleName = (e) =>{
        if(e.target.value.length < 1){
            setNameError("name is required")
        }
        else if(e.target.value.length<3){
            setNameError("name has to be more than 3 characters")
        }
        else{
            setNameError("")
        }
        setname(e.target.value)
    }
    //onChange to update firstName and lastName
    return (
        <form onSubmit={onSubmitHandler}>
        {error.map((error,i) => <p key={i}>{error}</p>)}

            <p>
                <label>Name :</label><br/>
                <input type="text" onChange={handleName} value={name}/>
                {nameError}
            </p>
            <input type="submit"/>
        </form>
    )
}