// functions in JS
// functions can take in ANY parameters
// Cannot overload functions

function greet(name){
    console.log("Hello " + name)
}

// functions can take in any TYPE for parameters
greet("Adam")
greet("Steven")
greet(8) 

// function can also take any AMOUNT of parameters // will call function with name undefined
greet()
greet("Kevin","string that will be completely ignored")

function add(num1, num2){
    // there is no overloading in JS
    // if you want to have a function deal with multiple different types 
    // you have get creative

    return (num1 -false) + (num2 -false); // Englightend JS 
}

console.log(add("788","12"));

// You cannot define parameters types in ES6 you can define default values
// if you do not pass in that parameter specify what the default is 
function subtract(num1 = 0, num2 = 0){
    return num1 - num2;
}

subtract(100); // gives back 100

// FUNCTIONS ARE OBJECTS. You can store them in variables
let add2 = add;
console.log(add2(75,45));

// other ways to define functions
let multiply = function(num1, num2){
    return num1 * num2;
}

// Fat Arrow Notation
let divide = (num1, num2) => {
    return num1 / num2;
}