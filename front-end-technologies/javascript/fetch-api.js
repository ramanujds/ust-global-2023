// npm i node-fetch@2
// const fetch = require('node-fetch')

async function fetchUser(username){
    let response = await fetch('https://api.github.com/users/'+username)
   if(response.status===200){
        let data = await response.json()
        console.log(data)
        return data;
   }
   else{
    console.log(response.status)
    return {
        status:response.status, 
        error:response.statusText
    }
   }
}

// fetchUser('ram1uj').then(response => console.log(response))
//                         .catch(error=>console.error(error))