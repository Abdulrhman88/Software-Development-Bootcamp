import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";
import { Link } from 'react-router-dom';
    
const Update = (props) => {
    const { id } = useParams();
    const [name, setName] = useState({});
    const[error, setError] = useState([])

    const [nameError, setNameError] = useState(""); 
    
    
    useEffect(() => {
        axios.get(`http://localhost:8000/authors/${id}`)
            .then(res => {
                setName(res.data.name);
                
            })
    }, []);

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
        setName(e.target.value)
    }
    
    
    const updateauhors = e => {
        e.preventDefault();
        axios.put(`http://localhost:8000/authors/update/${id}` ,{name})
            .then(res => console.log(res))
            .catch(err=> {
                const errorObj = err.response.data.errors
                let errArr = []
                for (const key of Object.keys(errorObj)){
                    errArr.push(errorObj[key].message)
                }
                setError(errArr)
            }) 

    }
    
    return (
        <div>
            <h1>Favorite authors</h1>
            {error.map((error,i) => <p key={i}>{error}</p>)}

            <Link to={"/create/authors"} type="button">
                    Home
            </Link>
            <form onSubmit={updateauhors}>
                <p>
                    <label>name</label><br />
                    <input type="text" name="authors" value={name} onChange={handleName} />
                    {nameError}
                </p>

                <input type="submit" value="submit" />
                <Link to={"/create/authors"}>
                    Cansel
                </Link>
            </form>
        </div>
    )
}
    
export default Update;