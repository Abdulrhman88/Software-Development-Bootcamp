import React, { useEffect, useState } from 'react';
import ProudcutForm from '../components/ProudcutForm';
import ProudcutList from '../components/ProudcutList'
import axios from 'axios';
const Main = (props) => {
    const [proudcut, setproudcut] = useState([]);
    const [loaded, setLoaded] = useState(false);
    
    useEffect(()=>{
        axios.get('http://localhost:8000/new/prodect')
            .then(res=>{
                setproudcut(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    },[]);

    const removeFromDom = proudcutId => {
        setproudcut(proudcut.filter(proudcut => proudcut._id != proudcutId));
    }

    return (
        <div>
           <ProudcutForm/>
           <hr/>
           {loaded && (<ProudcutList proudcut={proudcut} removeFromDom={removeFromDom}/>)}
        </div>
    )
}

    
export default Main;