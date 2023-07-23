import React from 'react'
import { Link } from 'react-router-dom';
import axios from 'axios';
import { useParams } from 'react-router-dom';

    
const ProudcutList = (props) => {
    const { _id } = useParams();
    const { removeFromDom } = props;

    const deletProdect = (e,_id) => {
        axios.delete(`http://localhost:8000/prodect/delete/${_id}` )
            .then(res => console.log(res.data))
            .catch(err => console.error(err));
    }


    return (
        <div>
            {props.proudcut.map( (proudcut, i) =>
                <p key={i}> 
                <Link to={"/prodect/"+proudcut._id}>
                    {proudcut.Title}
                </Link> 
                <br></br>
                <br></br>

                <Link to={"/prodect/edit/"+proudcut._id}>
                    Edit
                </Link>
                <br></br>
                <button onClick={(e)=>{deletProdect(e,proudcut._id)}}>
                delete
                </button>
               
               
               </p>
            )}
        </div>
        
    )
    
            }
export default ProudcutList;