import React, { useContext, useEffect, useState } from 'react'
import ProductCard from './ProductCard'
import { ProductListContext } from '../../ProductListContext';
import { useSearchParams } from 'react-router-dom';
import { fetchProductsFromApi } from '../../apis/ProductApi';

const ViewProductPage = () => {

// const {productList,updateProductList} = useContext(ProductListContext);



const [productList,updateProductList] = useState([])

useEffect(()=>{
  fetchProductsFromApi().then((response)=>{
    updateProductList(response);
  })
},[]);
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
{!productList || productList.length==0 && <h2>No products available. Please add some products to your cart.</h2>}
{productList && productList.length>0 && 
    <div className='row'>
      {productList.map((product)=><ProductCard key={product.productId} product={product}/>
      )}
    </div>
}
    </div>
  )
}

export default ViewProductPage
