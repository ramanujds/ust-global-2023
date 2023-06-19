// write a fetch requset to the check api
// https://api.chucknorris.io/jokes/random
// log the response to the console
// log the value of the joke to the console

fetch('https://api.chucknorris.io/jokes/random')
  .then((response) => response.json())
  .then((data) => console.log(data.value));
