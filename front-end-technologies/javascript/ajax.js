let XMLHttpRequest = require('xhr2');


const getGitInfo = async (username)=> {
    return new Promise(
        (resolve,reject)=>{
            let xhr = new XMLHttpRequest();
            xhr.open("GET", "https://api.github.com/users/"+username, true);

            xhr.onload = function(){
                    if(this.status==200){
                        resolve(xhr.response)
                    }
                    else{
                        reject({
                            "status":404,
                            "message":"Not Found"
                        })
                    }
                }
            xhr.send()
            

    }
)
}

getGitInfo('ram1ujdx').then(response=>console.log(response))
                .catch(response=>console.log(response))