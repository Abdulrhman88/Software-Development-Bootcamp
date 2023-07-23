import React, {useContext} from 'react';
import MyContext from './Context';

const Form = (props) => {
    
    const {state,setState} = useContext(MyContext)
    

    const onChange =(e) => {
        e.preventDefault();
        setState(e.target.value);    
    }

    return (
        <>
        <form>
        <label>name:</label>
        <input type="text" placeholder='Enter Your name' value={state} onChange={onChange}></input>
        </form>
        </>

        // <StyledForm>
        //     <StyledLabel htmlFor="name">Tu Nombre: </StyledLabel>
        //     <StyledInput type="text" placeholder={"Ingrese su nombre"} value={state} onChange={onChange}/>
        // </StyledForm>            
    );
}

export default Form;