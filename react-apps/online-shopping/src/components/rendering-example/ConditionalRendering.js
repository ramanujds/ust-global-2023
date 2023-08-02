import React, { useState } from 'react'

const ConditionalRendering = () => {
   
//   let [message, setMessage] = useState('Hello World');
  let today = new Date('2023-08-05').getDay();

// Using if-else

//  let message = 'Hello World';
  
        // if(today >=6 ) {
        // return( 
        //     <div>
        //     <h2>Hello World</h2>
        //     <h3>Today is weekend</h3>
        //     </div>
        // )
        // } else {
        // return( 
        //     <div>
        //     <h2>Hello World</h2>
        //     <h3>Today is weekday</h3>
        //     </div>
        // )
        // }

// Using ternary operator

let message = today >=6 ? <h2>Today is weekend</h2> : <h2>Today is weekday</h2>;
  
        return( 
            <div>
            <h2>Hello World</h2>
            {message}
            </div>
        )

// Using && operator (short-circuit operator)

//  let message = today >=6 && <h2>Today is weekend</h2>;


//  return( 
//                 <div>
//                 <h2>Hello World</h2>
//                 {message}
//                 </div>
//             )
        
        
}

export default ConditionalRendering
