import React, {useState} from 'react';
import Context from './Context';

const Wrapper = (props) => {
    const {children} = props
    const [state, setState] = useState("");
    return (
        <Context.Provider value={{state, setState}}>
            {children}
        </Context.Provider>
    );
}

export default Wrapper;
