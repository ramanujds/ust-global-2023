import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';


const AddProductPage = ({productList, updateProductList}) => {
 
 

  let [product, updateProduct] = useState({});
  let [validForm, updateValidForm] = useState(false);
  let [validProductId, updateValidProductId] = useState(false);
  let [validProductName, updateValidProductName] = useState(false);
  let [validProductPrice, updateValidProductPrice] = useState(false);
  let [validProductDescription, updateValidProductDescription] = useState(false);


  let [prodctIdValidMessage, updateProductIdValidMessage] = useState('');
  let [productNameValidMessage, updateProductNameValidMessage] = useState('');
  let [productPriceValidMessage, updateProductPriceValidMessage] = useState('');
  let [productDescriptionValidMessage, updateProductDescriptionValidMessage] = useState('');


  const navigate = useNavigate();

    const navigateToViewProducts = () => {
        navigate('/view-products');
    }

  useEffect(()=>{
    let isValidForm = validProductId && validProductName && validProductPrice && validProductDescription;
    updateValidForm(isValidForm);
  },[validProductId, validProductName, validProductPrice, validProductDescription]);




  const addProduct = (e) => {
    e.preventDefault();
    console.log(product);
    let newProductList = [...productList, product];
    updateProductList(newProductList);
    navigateToViewProducts();
  }

  
  const handleInputChange = (e) => {
    let inputName = e.target.name;
    let inputValue = e.target.value;
   
    switch(inputName){
      case 'productId':
        updateValidProductId(e.target.validity.valid);
        updateProductIdValidMessage('Product Id should be minimum 10');
        break;
      case 'productName':
        updateValidProductName(e.target.validity.valid);
        updateProductNameValidMessage('Product Name should be minimum 5 characters');
        break;
      case 'productPrice':
        updateValidProductPrice(e.target.validity.valid);
        updateProductPriceValidMessage('Product Price should be minimum 1');
        break;
      case 'productDescription':
        updateValidProductDescription(e.target.validity.valid);
        updateProductDescriptionValidMessage('Product Description should be minimum 10 characters');
        break;
    }
    updateProduct({...product, [inputName]:inputValue});

  
  }

   

  const resetForm = () => {
    updateProduct({});
    updateValidForm(false);
    updateValidProductId(false);
    updateValidProductName(false);
    updateValidProductPrice(false);
    updateValidProductDescription(false);
    updateProductIdValidMessage('');
    updateProductNameValidMessage('');
    updateProductPriceValidMessage('');
    updateProductDescriptionValidMessage('');
    // clear all the inputs
    let inputs = document.querySelectorAll('input');
    inputs.forEach(input => {
      input.value = '';
    }
    );

  }

 

  return (
    <div>
      <form onSubmit={(e)=>{addProduct(e)}} onReset={()=>resetForm()} className='form'>
        <div className='form-group'>
          <label>Product Id</label>
          <input type='number' name='productId' className='form-control' required min={1}  
            onChange={(e)=>{handleInputChange(e)}}/>
            {!validProductId?<p className='text-danger'>{prodctIdValidMessage}</p>:<p></p>}
          </div>
          <div className='form-group'>
          <label>Product Name</label>
          <input type='text' name='productName' required pattern='[a-zA-Z0-9 ]{5,}' className='form-control' 
            onChange={(e)=>{handleInputChange(e)}}/>
            {!validProductName?<p className='text-danger'>{productNameValidMessage}</p>:<p></p>}
          </div>
          <div className='form-group'>
          <label>Product Price</label>
          <input type='number' name='productPrice' required min={1} className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          {!validProductPrice?<p className='text-danger'>{productPriceValidMessage}</p>:<p></p>}
          </div>
          <div className='form-group'>
          <label>Product Description</label>
          <input type='text' name='productDescription' required minLength={10} className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          {!validProductDescription?<p className='text-danger'>{productDescriptionValidMessage}</p>:<p></p>}
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
