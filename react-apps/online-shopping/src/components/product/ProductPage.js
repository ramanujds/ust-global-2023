import React, { useState } from 'react'
import AddProductPage from './AddProductPage'
import ViewProductPage from './ViewProductPage'

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
          <AddProductPage productList={productList} updateProductList={updateProductList}/>
          </div>
          <div className='col-12'>
          <ViewProductPage productList={productList}/>
          </div>
          </div>
          </div>
    </div>
  )
}

export default ProductPage
