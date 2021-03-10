// JS is a fairly functional programming language
// Functions are objects. (Functions are first class)
// you can store them in variables and do anything else you can do with regular objects

// FUNCTIONS ARE OBJECTS
// functions are objects that have a hidden 'code' property
// you can invoke this code with ()
let add = function (num1, num2){
    return num1 +num2;
}

console.log(add) // prints out a function OBJECT
add.something = 100;// totally fine. Functions are objects you can add meaningless properites
// because every object in JS can be mutatated at any time
console.log(add(100,50))
console.log(add)
console.log(add.something)

// functions can have functions within them
// origin of encapsulation

// this creates an object with these properties then return the object
// a 100% functional no this keyword object constructor
        function createPerson(name, age){
            let person = {name:name,age:age}

            person.sayHello = function(){
                console.log("hello my name is" + name)
            }

            return person
    }


    function welcomeAll(people){

        let greet = function(person){ // a function defined within a function
            console.log("Hello " +person)
        }

        for(let p of people){
            greet(p)
        }

}

welcomeAll(["Adam","Richard","sierra","ryan"])

// spread operator
// turns an array into multiple arguments
let info =[100,300]
function subtract(num1, num2){
    return num1 -num2
}

subtract(...info) // spread out the elements into individual values
