import React, { useEffect, useState } from 'react'
import { fetchCartItemsFromApi } from '../../apis/CartApi'
import ViewCartItemCard from './ViewCartItemCard';
import { Button,CloseButton,Modal, Toast, ToastContainer } from 'react-bootstrap';
import ViewOrdderItemCard from '../order/ViewOrderItemCard';
import { addOrderToApi } from '../../apis/OrderApi';
import { useNavigate } from 'react-router-dom';




const ViewCart = () => {

    let [cartDetails, updateCartDetails] = useState({cartItems:[{cartId:1,productId:1,productName:'Product 1',totalPrice:0,quantity:0}],totalCartValue:0}); 

    let [showModal, setShowModal] = useState(false);

    let [showToast, setShowToast] = useState(false);

    const navigate = useNavigate();

    const navigateToViewOrders = () => {
        navigate('/view-orders');
    }


    console.log(cartDetails);
    useEffect(()=>{
        fetchCartItems();
        },[]);

    const fetchCartItems = () => {
        fetchCartItemsFromApi().then((response)=>{
            console.log(response);
            console.log(cartDetails);
            updateCartDetails(response);
        })
    }

    const checkout = (e) => {
        e.preventDefault();
        const order = {
            "orderItems": cartDetails.cartItems
        }

        addOrderToApi(order).then((response)=>{
            setShowToast(true);
            setTimeout(()=>{navigateToViewOrders()},3000)
        })
            ;
        


    }

    const isCartEmpty = () => {
        if(cartDetails!=null && cartDetails.cartItems!=null && cartDetails.cartItems.length>0){
            return true;
        }
        return false;
    }

  return (
    <div className='container'>
    <div className='row'>
        <div className='col-12'>
            <div className='jumbotron'>
                <h1 className='display-4'>List of items in your cart</h1>
                <p className='lead'>You can checkout any of the following products.</p>
                <hr className='my-4'/>
            </div>
        </div>
        {!isCartEmpty() && <h2>Your cart is empty. Please add some items to your cart.</h2>}
        {isCartEmpty() && <>
        {cartDetails.cartItems.map((cartItem)=><ViewCartItemCard cartItem={cartItem} fetchCartItems={fetchCartItems} key={cartItem.cartId}/>)}
        <h2>Cart Total : {cartDetails.totalCartValue}</h2>
        <hr className='my-4'/>
        {/* create a button group with two buttons next to each other with some spacing between them */}
       <div className='row'>
        <div className='col-auto'>
        <Button variant='primary' size='lg'>Continue Shopping</Button>
        </div>
        <div className='col-auto'>
        <Button variant='success' size='lg' onClick={()=>setShowModal(true)}>Checkout</Button>
        </div>
        </div>
    
        </> } 
    </div>

{isCartEmpty() && <div>
<Modal show={showModal} scrollable={true}>
        <Modal.Header>
            <Modal.Title>Order Details</Modal.Title>
            <CloseButton onClick={()=>setShowModal(false)}/>
        </Modal.Header>
        <Modal.Body>
        {cartDetails.cartItems.map((cartItem)=><ViewOrdderItemCard cartItem={cartItem} key={cartItem.cartId}/>)}
        <h2>Cart Total : {cartDetails.totalCartValue}</h2>
        {/* Show payment options with radio buttons */}

        <p>Choose a payment option</p>
        <div className='form-check'>
            <input type='radio' checked className='form-check-input' name='paymentOption' value='COD'/>
            <label className='form-check-label'>Cash on Delivery</label>
        </div>
        <div className='form-check'>
            <input type='radio' className='form-check-input' name='paymentOption' value='DC'/>
            <label className='form-check-label'>Debit/Credit Card</label>
        </div>
        <div className='form-check'>
            <input type='radio' className='form-check-input' name='paymentOption' value='UPI'/>
            <label className='form-check-label'>UPI</label>
        </div>
        
        <ToastContainer position='middle-center'>
        <Toast show={showToast} onClose={()=>setShowToast(false)}>
            <Toast.Header>
                <strong className='mr-auto'>Order Placed</strong>
            </Toast.Header>
            <Toast.Body>
                Your order has been placed successfully. Redirecting to view orders page.
            </Toast.Body>
        </Toast>
        </ToastContainer>


        </Modal.Body>
        <Modal.Footer>
            <Button variant='secondary' onClick={()=>setShowModal(false)}>Close</Button>
            <Button variant='success' onClick={e=>checkout(e)}>Make Payment</Button>
        </Modal.Footer>
    </Modal> 
   
</div>}

    </div>
  )
}

export default ViewCart
