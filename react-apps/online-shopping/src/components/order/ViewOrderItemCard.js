import React from 'react'
import { Button, Card } from 'react-bootstrap'


const ViewOrdderItemCard = ({cartItem}) => {
  

  return (
    <div style={{paddingBottom: '2rem'}} className='col-3'>
    <Card style={{ width: '18rem' }}>
    <Card.Body>
        <Card.Title>{cartItem.productName}</Card.Title>
        <Card.Text>
        Quantity : {cartItem.quantity}
        </Card.Text>
        <Card.Text>
        Price : {cartItem.totalPrice}
        </Card.Text>
    </Card.Body>
    </Card>
    </div>





  )
}

export default ViewOrdderItemCard
