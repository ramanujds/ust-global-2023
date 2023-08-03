import React, { useState } from 'react'

const AddProductPage = ({productList, updateProductList}) => {
 

  let [product, updateProduct] = useState({});

  const addProduct = (e) => {
    e.preventDefault();
    

    // let numbers = [1,2,3,4,5];
    // let newNumbers = [...numbers, 6];

    let newProductList = [...productList, product];
    updateProductList(newProductList);
    resetForm();
    
  }

  const handleInputChange = (e) => {
    let inputName = e.target.name;
    let inputValue = e.target.value;
    updateProduct({...product, [inputName]:inputValue});

  }

  const resetForm = () => {
    updateProduct({});
  }

 

  return (
    <div>
      <form onSubmit={(e)=>{addProduct(e)}} onReset={()=>resetForm()} className='form'>
        <div className='form-group'>
          <label>Product Id</label>
          <input type='number' name='productId' className='form-control'  
            onChange={(e)=>{handleInputChange(e)}}/>
          </div>
          <div className='form-group'>
          <label>Product Name</label>
          <input type='text' name='productName' className='form-control' 
            onChange={(e)=>{handleInputChange(e)}}/>
          </div>
          <div className='form-group'>
          <label>Product Price</label>
          <input type='number' name='productPrice' className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          </div>
          <div className='form-group'>
          <label>Product Description</label>
          <input type='text' name='productDescription' className='form-control' onChange={(e)=>{handleInputChange(e)}}/>

          </div>
          <div className='form-group'>
          <input type='submit' className='btn btn-primary' value='Add Product'/>
          <input type='reset' className='btn btn-dark' value='Reset'/>
          </div>
          </form>

    </div>
  )
}

export default AddProductPage
