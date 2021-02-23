
// scopes in JS
// Scoping is done mostly via key words, var, let and const,

x = 100; // global variable accessible anywhere in the code
// no keyword is global. I think this was a REALLY poor design choice

// semi-colons are optional you should use them
function hello(){

    {
        let greeting = "Hello everyone !!!!" // let and const are block scope
        greeting = "Wassup Everyone!!!" // cannot reassign a const
        console.log(greeting);
    }
    // console.log(greeting);// error!!!!
}
hello();

//console.log(greeting)// undefined

function hola(){
    // global variables are dangerous. Avoid if possible
    bienvenidos = "Hola todos !!!!" // this variable is global and can be used OUTSIDE THE FUNCTION
    console.log(bienvenidos)
}
hola();

console.log(bienvenidos);// Hola Todos

function bonjour(){
    // Friends do not let friends use var
    {
        var greet = "Bonjour !!!" // var is function scope. NOT BLOCK scope FUNCTION
        console.log(greet)
    }
    console.log(greet);
  
}
bonjour()

function hoisting(){
    // before a single line of code in a function is executed
    // all var variables are given the default value of

    console.log(adam) // prints undefined not an error
    var adam = "Adam Ranieri";
}

hoisting();






