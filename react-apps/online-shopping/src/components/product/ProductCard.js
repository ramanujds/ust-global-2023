import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import  Toast  from 'react-bootstrap/Toast';
import ToastContainer from 'react-bootstrap/ToastContainer';
import { addCartItemToApi } from '../../apis/CartApi';

const ProductCard = ({product}) => {
    let productImg = 'https://source.unsplash.com/random/200x200?sig='+product.productId;

    let [showToast, updateShowToast] = useState(false);

    const navigate = useNavigate();

    const navigateToCart = () => {
        navigate('/cart');
    }

    const addToCart = (productId) => {
      addCartItemToApi(productId).then((response)=>{
        console.log(response);
        updateShowToast(true);
      })
       
    }

    return (
  
     // display the product details in a card with image in the left and product details in the right with a button to add the product to the cart
     // evrery row should have 4 cards and a padding of 2 between the next row

   
      <div style={{paddingBottom: '2rem'}} className='col-3'>
        <Card style={{ width: '18rem' }}>
        <Card.Img variant="top" src={productImg} />
        <Card.Body>
          <Card.Title>{product.productName}</Card.Title>
          <Card.Text>
          {product.productDescription}
          </Card.Text>
          <Card.Text>
          Price : {product.productPrice}
          </Card.Text>
          <Button variant="primary" onClick={()=>addToCart(product.productId)}>Add to Cart</Button>
        </Card.Body>
      </Card>

      {/*  display a big toast message at the middle of the page conditionally, toast should have a button to navigate to the cart, dim the background */}
      <ToastContainer position='middle-center'>
        <Toast show={showToast} onClose={()=>{updateShowToast(false)}}>
          <Toast.Header>
            <strong className='mr-auto'>Item Added</strong>
          </Toast.Header>
          <Toast.Body>
            Item has been added to the cart successfully
          </Toast.Body>
          <Toast.Body>
            <button className='btn btn-primary' onClick={()=>{navigateToCart()}}>View Cart</button>
          </Toast.Body>
        </Toast>
      </ToastContainer>



      </div>

     
  
              
    )
}

export default ProductCard
