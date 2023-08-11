
const baseurl = "http://localhost:8888/api/auth";

export const userLoginApi = async (user) => {
    const response = await fetch(baseurl+"/login", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)

    });
    const data = await response.json();
    return data;
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