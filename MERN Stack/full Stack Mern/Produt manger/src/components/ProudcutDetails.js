import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";
    
const ProudcutDetails = (props) => {
    const [product, setprodect] = useState({})
    const { _id } = useParams();
    
    useEffect(() => {
        axios.get(`http://localhost:8000/prodect/${_id}`)
            .then(res => setprodect(res.data))
            .catch(err => console.error(err));
    }, []);
    
    return (
        <div>
            <h1>info about Proudcut</h1>
            <p>Title: {product.Title}</p>
            <p>Price : {product.Price}</p>
            <p>Description: {product.Description}</p>
            
        </div>
    )
}
    
export default ProudcutDetails;