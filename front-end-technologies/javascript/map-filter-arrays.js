let arr = [10,20,30,40,50,60,70,80]

// filtering data
// find all the elements which are multiple of 20

let arr20s = arr.filter(e=>e%20==0)

console.log(arr20s)

// find an element

let arr30s = arr.find(e=>e%30==0)

console.log(arr30s)


// Applying some changes to the elements

let arrd10 = arr.map(e=>e/10)

console.log(arrd10)

// Count Sum Reduce

let count20s = arr.filter(e=>e%20==0).length;

console.log(count20s)

// Find the sum of all the elements

let sum = arr.reduce((x,y) => x+y).toFixed()

console.log(sum)

let arr2 = arr.concat(5);

console.log(arr)

let names = ['lekshmy','arathi','akhila']

names.sort((e1,e2)=> e2>e1)

console.log(names)

// Using Set and Map

let set = new Set([10,20,10,30,10,40]);

set.add(50)

console.log(set)

// Map in JavaSrcipt

let map = new Map();

map.set(1,'Lekshmy')
map.set(2,'Arathi')
map.set(3,'Akhila')

console.log(map.get(2))

