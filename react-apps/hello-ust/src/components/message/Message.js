import React, { useEffect, useState } from 'react'
import './Message.css'



const Message = ({msg,sender}) => {

   let [today, setToday] = useState(new Date().toISOString());
  // let [msg, setMsg] = useState('Hello from UST Global');
useEffect(() => {
  setInterval(() => {
    setToday(new Date().toISOString());
  }, 1000);},[])
  

  // setTimeout(() => { 
  //   setMsg('Hello from TR4 Room');
  // }, 5000);

  return (
    <div>
      <h2>{msg}, from : {sender}</h2>
      <button className='btn btn-primary'>Click Me</button>
      <p className="style1">Today is {today}</p>
    </div>
  
  )
}

export default Message

