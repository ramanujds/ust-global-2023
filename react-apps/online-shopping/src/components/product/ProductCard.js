import React from 'react'

const ProductCard = ({product}) => {
    let productImg = 'https://source.unsplash.com/random/200x200?sig='+product.productId;

    return (
  
      
      // use bootstrap card component
    <div className='col-md-4 col-lg-3'>
    {/* // craete a card for each product with same height and width */}
        <div className='card shadow-sm'>
  
          <img className='card-img-top' src={productImg} alt='Card cap' />
          <div className='card-body'>
            <h4 className='card-title'>{product.productName}</h4>
            <p className='card-text'>{product.productDescription}</p>
            <p className='card-text'>Price: {product.productPrice}</p>
            <a href='#' className='btn btn-primary'>Add to Cart</a>
          </div>
        </div>
      </div>
  
  
              
    )
}

export default ProductCard
