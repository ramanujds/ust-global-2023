
import './App.css';
import HomePage from './components/home/HomePage';
import React, { useEffect, useState } from 'react';
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

  let products = [{
    productId:101,
    productName:'Dell Inspiron 14 Laptop',
    productPrice:50000,
    productDescription:'Dell 14" Core i5 Laptop with 8GB RAM, 256GB SSD',
  },{
    productId:102,
    productName:'iPhone 14 Pro',
    productPrice:150000,
    productDescription:'Apple iPhone 14 Pro 256GB Graphite',
  },{
    productId:103,
    productName:'Samsung Galaxy S21',
    productPrice:100000,
    productDescription:'Samsung Galaxy S21 Ultra 5G 256GB Phantom Black',
  },{
    productId:104,
    productName:'OnePlus 9 Pro',
    productPrice:80000,
    productDescription:'OnePlus 9 Pro 256GB Morning Mist 5G',
  },{
    productId:105,
    productName:'Sony Bravia 55 inch TV',
    productPrice:80000,
    productDescription:'Sony Bravia 55" X90J 4K Ultra HD LED Google TV',
  },{
    productId:106,
    productName:'LG 55 inch TV',
    productPrice:70000,
    productDescription:'LG 55" 4K UHD HDR LED Smart TV'

  },
  {
    productId:107,
    productName:'Samsung 55 inch TV',
    productPrice:60000,
    productDescription:'Samsung 55" 4K UHD HDR QLED Tizen Smart TV' 
  },
  {
    productId:108,
    productName:'MacBook Pro',
    productPrice:200000,
    productDescription:'Apple MacBook Pro 13.3" with Touch Bar - M1 - 8GB - 256GB SSD'
  },
]


  const [productList, updateProductList] = useState(products);

  // const [username, updateUsername] = useState([]);
 
  
  return (
    // <UserContext.Provider value={{username,updateUsername}}>
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
    // </UserContext.Provider>
 

   

  );
}

export default App;
