
const baseurl = "http://localhost:8888/api/auth";

export const userLoginApi = async (user) => {
    // call login api with error handling
    const response = await fetch(baseurl+"/login",{
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    });

    if(response.status === 200){
        const data = await response.json();
        return data;
    }
    else{
        throw new Error('Invalid credentials');
    }

}

export const userAccessApi = async () => {
    let authToken ='' ;
    if(sessionStorage.getItem('auth')){
        // @ts-ignore
        authToken = sessionStorage.getItem('auth');
    }
    const response = await fetch(baseurl+"/user",{
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            "Auth" : authToken
        },
    });
    const data = await response.json();
    return data;
}