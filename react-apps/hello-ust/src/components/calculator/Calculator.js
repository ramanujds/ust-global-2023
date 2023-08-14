import React, { useState } from 'react'

const Calculator = () => {
  
    const [value, updateValue] = useState(0)

    let x=10;
    let y =20;
    function incrBy1(){
        updateValue(value+1)
    }
    const add=()=>{
        updateValue(x+y)
    }

    return (
        <div>
         <h2>Value : <h2 data-testid="value">{value}</h2></h2>
         <button onClick={incrBy1}>Increment By 1</button>
        <div>
            <h2>Value 1 : <span data-testid="x">{x}</span></h2>
            <h2>Value 2 : <span data-testid="y">{y}</span></h2>
            <h2>Sum : <span>{value}</span></h2>
            <button onClick={add}>Add</button>
        </div>

        </div>
    )


}

export default Calculator
