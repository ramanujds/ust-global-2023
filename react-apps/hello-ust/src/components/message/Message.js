import React from 'react'
import './Message.css'

const Message = () => {

  let today = new Date().toISOString();

  setInterval(() => {
    today = new Date().toISOString();
  }, 1000);

  return (
    <div>
      <h2>Hello from UST Global</h2>
      <h2>We are in TR4 Room</h2>
      <button className='btn btn-primary'>Click Me</button>
      <p className="style1">Today is {today}</p>
    </div>
  
  )
}

export default Message

