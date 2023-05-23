let arr = [10,20,30,'Ramesh','Suresh'];

// Printing an Array
// for(let i=0; i<arr.length; i++){
//     console.log(arr[i])
// }

// for(let i of arr){
//     console.log(i)
// }

// arr.forEach(i => console.log(i))

// Adding a new element

arr.push(100);
arr.push("Harsh");

console.log(arr)

// Removing an element

arr.pop(); // will remove the last element
console.log(arr);

// How to remove a specific element

arr.splice(2,1);

console.log(arr);




