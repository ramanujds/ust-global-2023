import React from 'react'
import { Button, Card } from 'react-bootstrap'
import { deleteCartItemFromApi } from '../../apis/CartApi'


const ViewCartItemCard = ({cartItem,fetchCartItems}) => {
    const removeFromCart= (productId)=> {
        deleteCartItemFromApi(productId).then(data=>{
           fetchCartItems();
        }
        )
    }
    let productImg = 'https://source.unsplash.com/random/200x200?sig='+cartItem.productId;

  return (
    <div style={{paddingBottom: '2rem'}} className='col-3'>
    <Card style={{ width: '18rem' }}>
    <Card.Img variant="right" src={productImg} />
    <Card.Body>
        <Card.Title>{cartItem.productName}</Card.Title>
        <Card.Text>
        Quantity : {cartItem.quantity}
        </Card.Text>
        <Card.Text>
        Price : {cartItem.totalPrice}
        </Card.Text>
        <Button variant="danger" onClick={()=>removeFromCart(cartItem.productId)}>Remove this item</Button>    
    </Card.Body>
    </Card>
    </div>





  )
}

export default ViewCartItemCard
