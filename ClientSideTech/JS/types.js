// types in JS
// primtive types and objects in JS

// primitive types
let num = 10 ; // number there is no int or double or float. Just number
let word = "hello" // strings are a primitive in JS
let undef = undefined // undefined is the default value of everyrthing in JS
// you shoud NEVER set a value to undefined
let nul = null // a value representing nothing that you explicitly assign
let bool = true // boolean value

// JS is a loosely typed language
// any variable can be coerced into another type
// coercion is a double edge sword because it can be really hard to predict the results
// due to some really quirky coercion rules

let x = 1000;
let y = "700";

// number - string (JS will coerce the string into a number for the operation)
console.log(x-y);// prints 300

// number + string (JS coerced the number into a string and then concated the two strings)
console.log(x+y); // 1000700

// number - boolean (JS coerced the boolean into the number 1)
console.log(x - true) // 999

// string - number // JS coerced "false" into a NaN -10 = NaN
console.log("false"-10) //

// string - number // JS coerced "" into false then into 0 -10 = -10
console.log(""-10) //

// JS has truthy and falsy values
// falsy values in JS (They will be coerced into the boolean false)
// falsy values imply some kind of non-existence
console.log(Boolean(0))
console.log(Boolean(""))
console.log(Boolean(null))
console.log(Boolean(undefined))
console.log(Boolean(NaN))
console.log(Boolean(false))

console.log(Boolean("false"))// true value because it is a string with characters in it

//loose equality == perform type coercion on our values to compare them
let num1 = "1000"
let num2 = 1000;
console.log(num1 == num2) // true

let a = false;
let b = "0";
let c = 0;

console.log(a == b);
console.log(b == c)
console.log(a == c)

// coercion is NOT transitively true

let result = "adam"*"steve";// VALID JS NaN is not a number
console.log(result)

//NaN is ALWAYS FALSE REGARDLESS OF COMPARISON
console.log(result == false); // false
console.log(result == 0); // false
console.log(result == result); // false

// Avoid type coercion when you can
// === strict equality operator
// comapres value AND type
console.log(num1 === num2) // false same value different types