import React, {useContext} from 'react';
import Context from './Context'

const Navbar = () => {
    const {state} = useContext(Context)
    
    return (
       <>
      Hi {state}!

       </>        
    );
}

export default Navbar;