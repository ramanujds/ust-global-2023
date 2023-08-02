import React, { useState } from 'react'
import AddProductPage from './AddProductPage'
import ViewProductPage from './ViewProductPage'

const ProductPage = () => {

  let product = {
    productId:0,
    productName:'',
    productPrice:0,
    productDescription:'',
  }
  let [productList, updateProductList] = useState([[product]]);

  return (
    <div>
      <div className='container'>
        <div className='row'>
          <div className='col-md-12 col-lg-6'>
          <AddProductPage updateProductList={updateProductList}/>
          </div>
          <div className='col-md-12 col-lg-6'>
          <ViewProductPage productList={productList}/>
          </div>
          </div>
          </div>
    </div>
  )
}

export default ProductPage
