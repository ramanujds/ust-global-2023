function greet(message,callback){
    console.log(message)
    callback()
}

function callMe(){
    console.log('CallMe function called')
}

setTimeout(()=>greet('Good Afternoon',callMe),5000)
