function greet(message, callback){
    console.log(message)
    callback()
}

function callMe(){
    console.log('Callback function called')
}

greet('Good Afternoon',callMe)
greet('Hello World',()=>console.log('I am a better callback'))