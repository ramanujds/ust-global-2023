
import './App.css';
import HomePage from './components/home/HomePage';
import React, { useEffect, useState, useReducer } from 'react';
import ConditionalRendering from './components/rendering-example/ConditionalRendering';
import ListRendering from './components/rendering-example/ListRendering';

import HeaderPage from './components/header/HeaderPage';
import AddProductPage from './components/product/AddProductPage';
import ViewProductPage from './components/product/ViewProductPage';
import { Route, Routes } from 'react-router-dom';
import FooterPage from './components/footer/FooterPage';
import { UserContext } from './UserContext';
import { ProductListContext } from './ProductListContext';
import ViewCart from './components/cart/ViewCart';
import ViewOrders from './components/order/ViewOrders';
import LoginPage from './components/login/LoginPage';





function App() {


  

  


  // const [productList, updateProductList] = useState(products);


  const [login, setLogin] = useState(null);
  
  
  return (
    <UserContext.Provider 
// @ts-ignore
    value={{login, setLogin}}>
    <div className='container'>
      <div className='row'>
        <div className='col-md-12'>
          <HeaderPage />
        </div>
      </div>
      {/* <ProductListContext.Provider value={{productList, updateProductList}}> */}
      <Routes>
        <Route path='/' element={<HomePage />} />
        <Route path='/add-product' element={<AddProductPage/>} />
        <Route path='/view-products' element={<ViewProductPage/>} />
        <Route path='/cart' element={<ViewCart/>} />
        <Route path='/view-orders' element={<ViewOrders/>} />
        <Route path='/login' element={<LoginPage/>} />
      </Routes>
      {/* <ConditionalRendering/>
      <ListRendering/> */}
  
      {/* </ProductListContext.Provider> */}


      {/* <h3>Counter: {counter}</h3>
      <HomePage counter={counter} setCounter={setCounter}/> */}
      <FooterPage />

    </div>
     </UserContext.Provider>
 

   

  );
}

export default App;
