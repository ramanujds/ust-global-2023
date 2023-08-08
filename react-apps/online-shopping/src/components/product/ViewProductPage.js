import React, { useContext } from 'react'
import ProductCard from './ProductCard'
import { ProductListContext } from '../../ProductListContext';

const ViewProductPage = () => {

  const {productList,updateProductList} = useContext(ProductListContext);

  return (

    <div className='container'>
    <div className='row'>
        <div className='col-12'>
          <div className='jumbotron'>
          <h1 className='display-4'>List of available products</h1>
            <p className='lead'>You can add any of the following products to a shopping cart and checkout.</p>
            <hr className='my-4'/>
          </div>
        </div>
      </div>

    <div className='row'>
      {productList.map((product)=><ProductCard key={product.productId} product={product}/>
      )}
    </div>
    </div>
  )
}

export default ViewProductPage
