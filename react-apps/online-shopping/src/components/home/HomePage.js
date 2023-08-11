import React, { useState } from 'react'
import {
  MDBCarousel,
  MDBCarouselItem,
} from 'mdb-react-ui-kit';


import './HomePage.css'
import { NavLink } from 'react-router-dom';

const HomePage = () => {




  return (
    // create a landing page for the application with a welcome message in a jumbotron and a link to the about page
    // display an image carousel with 3 images
    <div className='container'>
      <div className='row'>
        <div className='col-12'>
          <div className='jumbotron'>
            <h1 className='display-4'>Welcome to Smart Shopping</h1>
            <p className='lead'>Smart Shopping is a shopping application that allows you to add products to a shopping cart and checkout.</p>
            <hr className='my-4' />
          </div>
        </div>
      </div>

      <div className='row'>
        <div className='col-12'>
        <MDBCarousel showControls>
      <MDBCarouselItem
        className='w-100 d-block'
        itemId={1}
        src='https://mybayutcdn.bayut.com/mybayut/wp-content/uploads/1-to-10-dirham-shops-abu-dhabi-_-Cover-2-30-1-23.jpg'
        alt='...'
      />
    </MDBCarousel>


      </div>

   

    </div>
    <div className='row'>
        <div className='col-12'>
        <div className='text-center'>
            <hr className='my-4' />
            <NavLink className='btn btn-primary btn-lg' to='/view-products' role='button'>Get Started</NavLink>
        </div>
        </div>

    </div>
    </div>



    

    
  )
}

export default HomePage
