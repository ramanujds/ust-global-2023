// npm i node-fetch@2
// const fetch = require('node-fetch')

async function getAllEmployees() {
    let response = await fetch('http://localhost:3500/employees')
    if (response.status === 200) {
        let data = await response.json()
        console.log(data)
        return Promise.resolve(data)
    }
    else {
        console.log(response)
        return Promise.reject({
            message: `Error ${response.status}`
        })
    }
}

async function getEmployeeById(id) {
    let response = await fetch('http://localhost:3500/employees/' + id)
    if (response.status === 200) {
        let data = await response.json()
        console.log(data)
        return Promise.resolve(data)
    }
    else {
        console.log(response)
        return Promise.reject({
            message: `Error ${response.status}`
        })
    }
}

async function saveEmployee(employee) {
    let response = await fetch('http://localhost:3500/employees', {
        method: 'POST',
        body: JSON.stringify(employee),
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        }
    })
    if (response.status === 201) {
        let data = await response.json()
        console.log(data)
        return Promise.resolve(data)
    }
    else {
        console.log(response)
        return Promise.reject({
            message: `Error ${response.status}`
        })
    }
}
