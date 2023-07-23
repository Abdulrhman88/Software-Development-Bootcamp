import '../style/style.css';
import React from 'react'

import { Link } from 'react-router-dom';
import { useParams } from 'react-router-dom';
import axios from 'axios';



    
const AuthorsList = (props) => {
    const { _id } = useParams();
    const { removeFromDom } = props;

    const deleteauthors = (e,_id) => {
        axios.delete(`http://localhost:8000/authors/delete/${_id}` )
            .then(res => console.log(res.data))
            .catch(err => console.error(err));
    }

    return (
        <div>
            
            <table>
                <thead>
                <tr>
                    <td>Authors</td>
                    <td>Action Availble</td>
                </tr>
                </thead>
                
                <tbody>
                    
                {props.authors.map( (authors, i) =>{
                return(
                    <tr key={i}>
                        <td>{authors.name}</td>
                        <td>
                        <Link to={"/auhors/edit/"+authors._id}>
                    EDIT
                        </Link>

                        <button onClick={(e)=>{deleteauthors(e,authors._id)}}>
                delete
                        </button>

                        </td>
                    </tr>
                )
                })}
                </tbody>
                
                
            </table>
                 
          
           
                   
                       
                       
        </div>
        
    )
    
            }
export default AuthorsList;