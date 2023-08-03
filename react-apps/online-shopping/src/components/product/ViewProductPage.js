import React from 'react'
import ProductCard from './ProductCard'

const ViewProductPage = ({productList}) => {
  return (
    <div className='row'>
      {productList.map((product)=><ProductCard key={product.productId} product={product}/>
      )}
    </div>
  )
}

export default ViewProductPage
