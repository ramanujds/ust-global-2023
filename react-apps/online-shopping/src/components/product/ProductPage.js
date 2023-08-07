import React, { useState } from 'react'
import AddProductPage from './AddProductPage'
import ViewProductPage from './ViewProductPage'
import { Route, Routes } from 'react-router-dom'

const ProductPage = () => {


  let product = {
    productId:101,
    productName:'Laptop',
    productPrice:50000,
    productDescription:'Laptop with Windows 11',
  }


  let [productList, updateProductList] = useState([product]);


 

  return (
    <div>
      <div className='container'>
        <div className='row'>
          <div className='col-12'>
          <Routes>
           <Route path='/add-product' element={<AddProductPage productList={productList} updateProductList={updateProductList}/>} />
           <Route path='/view-products' element={<ViewProductPage productList={productList}/>} />
      </Routes>
          </div>
    </div>
    </div>
    </div>
  )
}

export default ProductPage


{/* 

 <AddProductPage productList={productList} updateProductList={updateProductList}/>
          </div>
          <div className='col-12'>
          <ViewProductPage productList={productList}/>
          </div>
          </div>
 */}