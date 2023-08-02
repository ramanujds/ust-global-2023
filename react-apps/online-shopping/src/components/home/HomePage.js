import React, { useState } from 'react'
import './HomePage.css'

const HomePage = ({counter,setCounter}) => {


let [username, setUsername] = useState('');
let [age, setAge] = useState(0);

const handleClick = () => {
   setCounter(counter+1);
    console.log(username);
    console.log(age);
}

const readUsername = (username) => {
    setUsername(username);
}

  return (
    <div className='App home-style'>
      <h2>Home Page</h2>
      <h3>Counter: {counter}</h3>
      <p>Enter your name
        <input type="text" placeholder='Enter your name' 
            onChange={(event)=>readUsername(event.target.value)} />
        <input type="text" placeholder='Enter your age' 
            onChange={(event)=>setAge(parseInt(event.target.value))}/>
     </p>
      <button onClick={handleClick} className="btn btn-primary">Click Me</button>
      <div>
        <h3>Username: {username}</h3>
        <h3>Age: {age}</h3>
    </div>
    </div>
  )
}

export default HomePage
