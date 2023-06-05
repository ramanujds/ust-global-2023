// npm i node-fetch@2
const fetch = require('node-fetch')

async function fetchCustomers(){
    let response = await fetch('http://localhost:8000/api/customers')
   if(response.status===200){
        let data = await response.json()
        return Promise.resolve(data)
   }
   else{
    return Promise.reject({
        message:`Error ${response.status}`
    })
   }
}

fetchCustomers().then(response => console.log(response))
                         .catch(error=>console.error(error))

