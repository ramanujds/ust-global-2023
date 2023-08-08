import React, { useContext, useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { ProductListContext } from '../../ProductListContext';
import { addProdctApi } from '../../apis/ProductApi';


const AddProductPage = () => {

  // let {productList, updateProductList} = useContext(ProductListContext);
 
 

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
   // let newProductList = [...productList, product];
    addProdctApi(product).then((response)=>{
      console.log(response);
      navigateToViewProducts();
    }
    );
  }

    // updateProductList(newProductList);
    //updateProductList(newProductList);
    
  

  
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
    // create an inline form with 4 input fields with validation and error messages and 2 buttons
    // 1. Add Product button should be disabled until all the fields are valid
    // 2. Reset button should clear all the fields
    <div className='container'>
      <div className='row'>
        <div className='col-12'>
          <div className='jumbotron'>
            <h1 className='display-4'>Add a new Product</h1>
            <p className='lead'>Please enter the product details</p>
            <hr className='my-4' />
          </div>
        </div>
      </div>
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
          <button type='submit' className='btn btn-primary' disabled={!validForm}>Add Product</button>
          <button type='reset' className='btn btn-warning'>Reset</button>
          </div>
      </form>
    </div>

 )
}

export default AddProductPage

          


      {/* <form onSubmit={(e)=>{addProduct(e)}} onReset={()=>resetForm()} className='form'>
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
          </form> */}

