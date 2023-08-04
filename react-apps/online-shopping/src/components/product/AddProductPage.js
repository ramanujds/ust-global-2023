import React, { useEffect, useState } from 'react'
import { updateFor } from 'typescript';

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

  // useEffect(()=>{
  //   updateValidForm(true);
  // }, []);


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
    let productIdValid=false, productNameValid=false, productPriceValid=false, productDescriptionValid=false;
    switch(inputName){
      case 'productId':
        productIdValid = e.target.validity.valid;
        updateValidProductId(productIdValid);
        // @ts-ignore
        updateProductIdValidMessage(!productIdValid && <p className='text-danger'>'Product Id should be a number and minimum 10'</p>);
        break;
      case 'productName':
        productNameValid = e.target.validity.valid;
        updateValidProductName(productNameValid);
        // @ts-ignore
        updateProductNameValidMessage(!productNameValid && <p className='text-danger'>Product Name should be minimum 5 characters</p>);
        break;
      case 'productPrice':
        productPriceValid = e.target.validity.valid;
        updateValidProductPrice(productPriceValid);
        // @ts-ignore
        updateProductPriceValidMessage(!productPriceValid && <p className='text-danger'>Product Price should be minimum 1</p>);
        break;
      case 'productDescription':
        productDescriptionValid = e.target.validity.valid;
        updateValidProductDescription(productDescriptionValid);
        // if(productIdValid && productNameValid && productPriceValid && productDescriptionValid){
        //   updateValidForm(true);
        // }
        // @ts-ignore
        updateProductDescriptionValidMessage(!productDescriptionValid && <p className='text-danger'>Product Description should be minimum 10 characters</p>);
        break;
    }
    
   // let isFormValid = productIdValid && productNameValid && productPriceValid && productDescriptionValid;
    console.log(productIdValid, productNameValid, productPriceValid, productDescriptionValid);  
    let isValidForm = validProductId && validProductName && validProductPrice && validProductDescription;
    updateProduct({...product, [inputName]:inputValue});
    updateValidForm(isValidForm);

    // console.log(validProductId, validProductName, validProductPrice, validProductDescription);
    // console.log(validForm);

   
  
  }

   

  const resetForm = () => {
    updateProduct({});
    // clear all the validation messages
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
          <input type='number' name='productId' className='form-control' required min={10}  
            onChange={(e)=>{handleInputChange(e)}}/>
            {prodctIdValidMessage}
          </div>
          <div className='form-group'>
          <label>Product Name</label>
          <input type='text' name='productName' required pattern='[a-zA-Z0-9 ]{5,}' className='form-control' 
            onChange={(e)=>{handleInputChange(e)}}/>
            {productNameValidMessage}
          </div>
          <div className='form-group'>
          <label>Product Price</label>
          <input type='number' name='productPrice' required min={1} className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          {productPriceValidMessage}
          </div>
          <div className='form-group'>
          <label>Product Description</label>
          <input type='text' name='productDescription' required minLength={10} className='form-control' onChange={(e)=>{handleInputChange(e)}}/>
          {productDescriptionValidMessage}
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
