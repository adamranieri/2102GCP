// Arrays store items in an ordered index manner
// Arrays can store anything
// Dynamically resize themselves
// Arrays are objects

let hello = function(){
    console.log(hello);
}
let ray = [1,"f","Hello",90,null,{name:'Adam',age:19},hello]; 
console.log(ray)

// add to an array
ray.push("Steven")
console.log(ray)

// remove
ray.pop();
console.log(ray)

// get a specific element
let person = ray[5]; // this is not technially the 'array' syntax for getting an element
console.log(person)

// get the length
console.log(ray.length)

// iterate over an array
for(let i = 0;i<ray.length;i++){
    console.log(ray[i])
}

// for of loop
// identical to the above loop
for(let element of ray){
    console.log(element)
}

let steven = {name:"Steven", age:30, profession:"Supervisor"}
console.log(steven['profession']) // square brackets is actually a propery selector syntax

