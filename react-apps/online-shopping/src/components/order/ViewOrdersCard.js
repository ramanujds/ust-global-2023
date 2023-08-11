import React, { useEffect } from 'react'
import  Card from 'react-bootstrap/Card'; 

import ViewCartItemCard from '../cart/ViewCartItemCard';
import ViewOrdderItemCard from './ViewOrderItemCard';

const ViewOrdersCard = ({orderDetails}) => {
  useEffect(()=>{
    console.log(orderDetails);
  },[]);
  return (
    <div style={{ paddingBottom:'2rem'}} className='col-12'>
    <Card>
    <Card.Body>
        <Card.Title>Order Id : {orderDetails.id}</Card.Title>
        <Card.Text>
        Order Date : {orderDetails.dateOrdered}
        </Card.Text>
        <Card.Text>
        Order Status : {orderDetails.status}
        </Card.Text>
        <Card.Text>
        Total Price : {orderDetails.totalOrderValue}
        </Card.Text>
        <Card.Text>
        Ordered Items :
        </Card.Text>
        <div className='row'>
        {orderDetails.orderItems.map((orderItem)=><ViewOrdderItemCard cartItem={orderItem} key={orderItem.productId}/>)}
        </div>
    </Card.Body>
    </Card>
    </div>

  )
}

export default ViewOrdersCard
