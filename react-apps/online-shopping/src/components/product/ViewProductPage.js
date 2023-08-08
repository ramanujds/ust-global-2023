import React, { useContext, useEffect, useState } from 'react'
import ProductCard from './ProductCard'
import { ProductListContext } from '../../ProductListContext';
import { useSearchParams } from 'react-router-dom';
import { fetchProductsFromApi } from '../../apis/ProductApi';

const ViewProductPage = () => {

// const {productList,updateProductList} = useContext(ProductListContext);

const [productList,updateProductList] = useState([{productId:1,productName:'Product 1',productPrice:100,productDescription:'Product 1 description'}])

useEffect(()=>{
  fetch('http://localhost:8888/api/products')
  .then(response => response.json())
  .then(data => {
    updateProductList(data);
  })
  .catch(error => {
      console.log(error);
  }
  );
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

    <div className='row'>
      {productList.map((product)=><ProductCard key={product.productId} product={product}/>
      )}
    </div>
    </div>
  )
}

export default ViewProductPage
