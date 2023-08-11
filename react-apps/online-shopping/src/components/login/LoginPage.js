import React, { useContext, useState } from 'react';
import Button from 'react-bootstrap/Button';
import { userAccessApi, userLoginApi } from '../../apis/AuthApi';
import { UserContext } from '../../UserContext';

const LoginPage = () => {


    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const userNameContext = useContext(UserContext);

    const login = (e) => {
        e.preventDefault();
       userLoginApi({username, password}).then((response)=>{
              sessionStorage.setItem('auth', response.jwt);
              sessionStorage.setItem('user', username);
             //userNameContext.updateUsername(username);

         });

    }

    const checkLogin = () => {
        userAccessApi().then((response)=>{
            console.log(response);
        });
    }


    return (
        <div>
            <div className='container'>
                <div className='row'>
                    <div className='col-12'>
                        <div className='jumbotron'>
                            <h1 className='display-4'>Login</h1>
                            <p className='lead'>Please login to continue.</p>
                            <hr className='my-4' />
                            <div className='row'>
                                <div className='col-6'>
                                    <form onSubmit={(e)=>login(e)}>
                                        <div className='form-group'>
                                            <label htmlFor='username'>Username</label>
                                            <input type='text' className='form-control' id='username' placeholder='Enter username' 
                                            onChange={(e)=>setUsername(e.target.value)} />
                                        </div>
                                        <div className='form-group'>
                                            <label htmlFor='password'>Password</label>
                                            <input type='password' className='form-control' id='password' placeholder='Enter password' 
                                            onChange={(e)=>setPassword(e.target.value)}/>
                                        </div>
                                        <Button variant='primary' type='submit' className='btn btn-primary'>Login</Button>
                                        <Button variant='secondary' onClick={checkLogin} >Test Login</Button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default LoginPage
