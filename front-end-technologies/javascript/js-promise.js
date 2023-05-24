let count = 0;
let promise = new Promise(
    (resolve,reject)=>{
        if(count)
           resolve('Promise Resolved')
        else
            reject('Invalid Count value')
    }
)

promise.then((msg)=>{
    console.log(msg)
}).then(()=>console.log('Done'))
.catch(error => console.error(error))
.finally(()=>console.log('Execution Completed'))