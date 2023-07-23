import React, { useState } from  'react';
    
    
const UserForm = (props) => {
    const [firstname, setfirstname] = useState("");
    const [lastname, setlastname] = useState("");
    const [email, setEmail] = useState(""); 
    const [password, setPassword] = useState(""); 
    const [cpassword, setcPassword] = useState("");  

    //massge form sumbit form 
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);

    ////validations
    const [fnameEror, setfnameEror] = useState("");
    const [lnameEror, setlnameEror] = useState("");
    const [emailEror, setEmailEror] = useState("");
    const [passEror, setpassEror] = useState("");
    const [cpassEror, setcpassEror] = useState("");

    


 
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstname, lastname,email, password,cpassword };
        console.log("Welcome", newUser);
        setHasBeenSubmitted( true );

        setfirstname(firstname);
        if(firstname.length< 1) {
            setfnameEror("firstname required!");
        } else if(firstname.length< 2) {
            setfnameEror("first name 2 characters or longer!");
        }

        setlastname(lastname);
        if(lastname.length< 1) {
            setlnameEror("lastname is required!");
        } else if(lastname.length< 2) {
            setlnameEror("lastname must be 2 characters or longer!");
        }

        setEmail(email);
        if(email.length< 1) {
            setEmailEror("email is required!");
        } else if(email.length< 3) {
            setEmailEror("email must be 2 characters or longer!");
        }

        setPassword(password);
        if(password.length< 1) {
            setpassEror("password is required!");
        } else if(password.length< 3) {
            setpassEror("Password must be 8 characters or longer!");
        }

        setcPassword(cpassword);
        if(cpassword.length< 1) {
            setcpassEror("password Confirm is required!");
        } else if(password != cpassword) {
            setcPassword("Passowrd not match");
        }

      
    };
   
    const formMessage = () => {
      if( hasBeenSubmitted ) {
    return "Thank you for submitting the form!";
} else {
    return "Welcome, please submit the form";
}
  };
    
    return(
      <div>
        <form onSubmit={ createUser }>
            <div>
            <h3>{ formMessage() }</h3>

                <label>Firstname: </label> 
                <input type="text" value={firstname} onChange={ (e) => setfirstname(e.target.value) } />
                {
                    fnameEror ?
                    <p style={{color:'red'}}>{ fnameEror}</p> :
                    ''
                }
            </div>
            <div>
                <label>Last name: </label> 
                <input type="text" onChange={ (e) => setlastname(e.target.value) } />
                {
                    lnameEror ?
                    <p style={{color:'red'}}>{ lnameEror}</p> :
                    ''
                }
            </div>
            <div>
                <label>Email Address: </label> 
                <input type="text" onChange={ (e) => setEmail(e.target.value) } />
                {
                    emailEror ?
                    <p style={{color:'red'}}>{ emailEror}</p> :
                    ''
                }
            </div>
            <div>
                <label>Password: </label>
                <input type="text" onChange={ (e) => setPassword(e.target.value) } />
                {
                    passEror ?
                    <p style={{color:'red'}}>{ passEror}</p> :
                    ''
                }
            </div>

            <div>
                <label>Confirm Password: </label>
                <input type="text" onChange={ (e) => setcPassword(e.target.value) } />

                {
                    cpassEror ?
                    <p style={{color:'red'}}>{ cpassEror}</p> :
                    ''
                }
            </div>
            <input type="submit" value="Create User" />

            <h3>firstname: {firstname}</h3>
            <h3>last name :{lastname}</h3>
            <h3>Email Adress : {email}</h3>
            <h3>Password :{password}</h3>
            <h3>Confirm Password: :{cpassword}</h3>
        </form>
        </div>
        
        
    );
    
};
    
export default UserForm;