
import './App.css';
import HomePage from './components/home/HomePage';
import React, { useState } from 'react';
import ConditionalRendering from './components/rendering-example/ConditionalRendering';
import ListRendering from './components/rendering-example/ListRendering';
import ProductPage from './components/product/ProductPage';

function App() {

  let [counter, setCounter] = useState(0);

  return (
    <div className='container'>
      <h2>App Component</h2>
      {/* <ConditionalRendering/>
      <ListRendering/> */}
      <ProductPage/>

      {/* <h3>Counter: {counter}</h3>
      <HomePage counter={counter} setCounter={setCounter}/> */}
    </div>
  );
}

export default App;
