import React, { useState } from 'react';

export default () => {
    const [value, setInputVal] = useState('');
    const [list, setList] = useState([]);

    function add(e) {
        e.preventDefault();

        if(value === '') return;

        setList([...list, {text: value, completed: false}]);
        setInputVal('');
    }

    function remove(index) {
        setList(list.filter((_item, i) => i !== index));
    }

    function Checeked(index) {
        const o1 = {...list[index]
        };

        o1.completed = !o1.completed;

        setList([
            ...list.slice(0, index),
            o1
        ].concat(list.slice(index + 1)));
    }

    return (
        <>
            {list.map((item, i) => (
                <div key={i}>
                    <span style={{ textDecoration: item.completed && 'line-through' }}>{item.text}</span>
                    <input type="checkbox" checked={item.completed} onClick={() => Checeked(i)} readOnly/>
                    <button onClick={() => remove(i)}>Delete</button>
                </div>
            ))}

            <form onSubmit={add}>
                <input onChange={e => setInputVal(e.target.value)} value={value}/>
                <button>Add</button>
            </form>
        </>
    )
}