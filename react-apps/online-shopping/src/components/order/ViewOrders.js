import React, { useEffect, useState } from 'react'
import { fetchOrdersFromApi } from '../../apis/OrderApi'
import ViewOrdersCard from './ViewOrdersCard';


const ViewOrders = () => {

    const [orders, updateOrders] = useState([]); // 

    useEffect(()=>{
        fetchOrdersFromApi().then((response)=>{
            console.log(response);
            updateOrders(response);
        })
    },[]);


  return (
    <div className='container'>
    <div className='row'>
        <div className='col-12'>
            <div className='jumbotron'>
                <h2 className='display-4'>List of orders placed by you</h2>
                <p className='lead'>You can view the details of your orders.</p>
                <hr className='my-4'/>
            </div>
        </div>
        {!orders && <h2>No orders placed yet.</h2>}
        {orders && <>
        {orders.map((order)=><ViewOrdersCard orderDetails={order} key={order.orderId}/>)}
        </> }
      </div>
    </div>
  )
}

export default ViewOrders
