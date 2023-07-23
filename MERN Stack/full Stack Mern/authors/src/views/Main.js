import React, { useEffect, useState } from 'react';
import axios from 'axios';
import AuthorsForm from '../components/authorsForm';
import AuthorsList from '../components/Authors.List';
const Main = (props) => {
    const [authors, setauthors] = useState([]);
    const [loaded, setLoaded] = useState(false);
    
    useEffect(()=>{
        axios.get('http://localhost:8000/authors')
            .then(res=>{
                setauthors(res.data);
            })
            // setLoaded(true);
            .catch(err => console.error(err));
    },[authors]);

    const removeFromDom = authorsId => {
        setauthors(authors.filter(authors => authors._id != authors));
    }

    return (
        <div>
           <AuthorsForm/>
           <hr/>
           <AuthorsList authors={authors} removeFromDom={removeFromDom} />
        </div>
    )
}

    
export default Main;