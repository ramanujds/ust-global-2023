import logo from './logo.svg';
import './App.css';
import { useState } from 'react';







function App() {
  const [remainingTime, setRemainingTime] = useState('0 hours, 0 minutes, 0 seconds');
  const updateRemainingTime = () => {
    const now = new Date();
    const end = new Date('2023-07-31T18:00:00');
    const diff = end - now;
    const days = Math.floor(diff / 1000 / 60 / 60 / 24);
    const hours = Math.floor(diff / 1000 / 60 / 60) % 24;
    const minutes = Math.floor(diff / 1000 / 60) % 60;
    const seconds = Math.floor(diff / 1000) % 60;
    setRemainingTime(`${hours} hours, ${minutes} minutes, ${seconds} seconds`);
  };

  const timer = setInterval(() => {
    updateRemainingTime();
  }, 1000);
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          <h2>Complete it.. We have <span className='text-danger' >{remainingTime}</span> remaining</h2>
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
