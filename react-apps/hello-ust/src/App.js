import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Message from './components/message/Message';
import React from 'react';
import {UserDetails} from './components/user/UserDetails';







function App() {
  // const [remainingTime, setRemainingTime] = useState('0 hours, 0 minutes, 0 seconds');
  // const updateRemainingTime = () => {
  //   const now = new Date();
  //   const end = new Date();
  //   end.setHours(18);
  //   end.setMinutes(0);
  //   end.setSeconds(0);
  //   const diff = end - now;
  //   const days = Math.floor(diff / 1000 / 60 / 60 / 24);
  //   const hours = Math.floor(diff / 1000 / 60 / 60) % 24;
  //   const minutes = Math.floor(diff / 1000 / 60) % 60;
  //   const seconds = Math.floor(diff / 1000) % 60;
  //   setRemainingTime(`${hours} hours, ${minutes} minutes, ${seconds} seconds`);
  // };

  // const timer = setInterval(() => {
  //   updateRemainingTime();
  // }, 1000);
  return (
    <div className="App">
    <h1>UST Global</h1>
    <Message msg ='Hello Everyone' sender='Tony'/>
    <Message msg = 'Welcome to React' sender='Facebook'/>
    <UserDetails username='Rahul' age='20' />
    <UserDetails username = 'Karan' age='25' />
    </div>
  );
}

export default App;
