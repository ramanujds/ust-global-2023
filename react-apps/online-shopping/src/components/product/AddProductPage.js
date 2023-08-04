import React, { useState } from 'react'

const AddProductPage = ({productList, updateProductList}) => {
 

  let [product, updateProduct] = useState({});
  let [validProductId, updateValidProductId] = useState(false);
  let [validProductName, updateValidProductName] = useState(false);
  let [validProductPrice, updateValidProductPrice] = useState(false);
  let [validProductDescription, updateValidProductDescription] = useState(false);
  let [validForm, updateValidForm] = useState(false);

  const addProduct = (e) => {
    e.preventDefault();
    

    // let numbers = [1,2,3,4,5];
    // let newNumbers = [...numbers, 6];

    let newProductList = [...productList, product];
    updateProductList(newProductList);
    
  }

  const handleInputChange = (e) => {
    let inputName = e.target.name;
    let inputValue = e.target.value;
    switch(inputName){
      case 'productId':
        updateValidProductId(inputValue > 0);
        break;
      case 'productName':
        updateValidProductName(inputValue.length > 5);
        break;
      case 'productPrice':
        updateValidProductPrice(inputValue > 0);
        break;
      case 'productDescription':
        updateValidProductDescription(inputValue.length > 10);
        break;
    }
    updateProduct({...product, [inputName]:inputValue});

    updateValidForm(validProductId && validProductName && validProductPrice && validProductDescription);

    console.log(validProductId, validProductName, validProductPrice, validProductDescription);
    console.log(validForm);

   
  
  }

   

  const resetForm = () => {
    updateProduct({});
    updateValidProductId(false);
    updateValidProductName(false);
    updateValidProductPrice(false);
    updateValidProductDescription(false);
    updateValidForm(false);
    
  }

 

  return (
    <div>
      <form onSubmit={(e)=>{addProduct(e)}} onReset={()=>resetForm()} className='form'>
        <div className='form-group'>
          <label>Product Id</label>
          <input type='number' name='productId' className='form-control'  
            onChange={(e)=>{handleInputChange(e)}}/>
            <p className='text-danger' hidden={validProductId}>Invalid ID</p>
          </div>
          <div className='form-group'>
          <label>Product Name</label>
          <input type='text' name='productName' className='form-control' 
            onChange={(e)=>{handleInputChange(e)}}/>
            <p className='text-danger' hidden={validProductName}>Invalid Name</p>
          </div>
          <div className='form-group'>
          <label>Product Price</label>
          <input type='number' name='productPrice' className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          <p className='text-danger' hidden={validProductPrice}>Invalid Price</p>
          </div>
          <div className='form-group'>
          <label>Product Description</label>
          <input type='text' name='productDescription' className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          <p className='text-danger' hidden={validProductDescription}>Invalid Description</p>
          </div>
          <div className='form-group'>
          <input type='submit' disabled={!validForm} className='btn btn-primary' value='Add Product'/>
          <input type='reset' className='btn btn-dark' value='Reset'/>
          </div>
          </form>

    </div>
  )
}

export default AddProductPage
