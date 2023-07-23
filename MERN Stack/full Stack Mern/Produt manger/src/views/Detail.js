import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";
    
const Detail = (props) => {
    const [product, setprodect] = useState({})
    const { id } = useParams();
    
    useEffect(() => {
        axios.get('http://localhost:8000/new/prodect/' +id)
            .then(res => setprodect(res.data))
            .catch(err => console.error(err));
    }, []);
    
    return (
        <div>
            <p>Title: {product.Title}</p>
            <p>Price : {product.Price}</p>
            <p>Description: {product.Description}</p>
            
        </div>
    )
}
    
export default Detail;