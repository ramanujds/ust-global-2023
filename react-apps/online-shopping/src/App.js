
import './App.css';
import HomePage from './components/home/HomePage';
import React, { useEffect, useState } from 'react';
import ConditionalRendering from './components/rendering-example/ConditionalRendering';
import ListRendering from './components/rendering-example/ListRendering';
import ProductPage from './components/product/ProductPage';
import HeaderPage from './components/header/HeaderPage';
import AddProductPage from './components/product/AddProductPage';
import ViewProductPage from './components/product/ViewProductPage';
import { Route, Routes } from 'react-router-dom';

function App() {
  // console.log('App Component Rendered');

  // let [time, setTime] = useState(new Date().toLocaleTimeString());

  // useEffect(() => {
  //   console.log('useEffect Called');
  //   setInterval(() => {
  //     setTime(new Date().toLocaleTimeString());
  //   },1000)
  // }, []);



  return (
    <div className='container'>
      <div className='row'>
        <div className='col-md-12'>
          <HeaderPage />
        </div>
      </div>
      <Routes>
        <Route path='/' element={<HomePage />} />
      </Routes>
      {/* <ConditionalRendering/>
      <ListRendering/> */}
      <ProductPage />


      {/* <h3>Counter: {counter}</h3>
      <HomePage counter={counter} setCounter={setCounter}/> */}
    </div>
  );
}

export default App;
