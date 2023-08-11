import React, { useContext } from 'react'
import { NavLink } from 'react-router-dom'
import { UserContext } from '../../UserContext';




const NavBarPage = () => {
  //  let username = useContext(UserContext);

  let username = sessionStorage.getItem('user');

  return (
    <div>
    {/* create a simple nabbar in tab style */}
    <nav className="navbar navbar-expand-lg navbar-tab bg-light">
    <NavLink className="navbar-brand" to="/">Smart Shopping</NavLink>
    <div className="collapse navbar-collapse" id="navbarNav">
    <ul className="navbar-nav">
    <li className="nav-item">
    <NavLink className="nav-link" to="/add-product">Add Product</NavLink>
    </li>
    <li className="nav-item">
    <NavLink className="nav-link" to="/view-products">Browse Products</NavLink>
    </li>
    <li className="nav-item">
    <NavLink className="nav-link" to="/cart">View Cart</NavLink>
    </li>
    </ul>
    </div>
  
    
    {/* Create options for sign in and view orders and align it at the right end */}
   
    <div className="collapse navbar-collapse" id="navbarNav">
    <ul className="navbar-nav ml-auto">
    <li className="nav-item">
    <NavLink className="nav-link" to="/login">Logged in as : {username}</NavLink>
    </li>
    <li className="nav-item">
    <NavLink className="nav-link" to="/view-orders">View Orders</NavLink>
    </li>
    </ul>
    </div>
    </nav>
    </div>

   


    
  )
}

export default NavBarPage

