import React from 'react'
import { NavLink } from 'react-router-dom'

const NavBarPage = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <a className="navbar-brand" href="/"><h2>Online Shopping</h2></a>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup"
            aria-expanded="false"
            aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
            <div className="navbar-nav">
                <NavLink className="nav-item nav-link active" to="/">Home</NavLink>
                <NavLink className="nav-item nav-link" to="/add-product">Add Product</NavLink>
                <NavLink className="nav-item nav-link" to="/view-products">Browse Products</NavLink>
                <NavLink className="nav-item nav-link" to="/cart">View Cart</NavLink>
                </div>
                </div>
                </nav>


    </div>
  )
}

export default NavBarPage
