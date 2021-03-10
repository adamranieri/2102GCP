// JS is NOT Class based
// you can create objects without having a class already defined
// Objects are just key value pairs
// akin dictionaries in Python

// object literal
// A JSO
let adam = {
    name:"Adam Senior",
    age:19, 
    profession: "Java Trainer",

    // a method is a function that is attached to an object
    sayHello:  function() {
        console.log("Hello my name is " + this.name)
        console.log(this)
    }

}
console.log(adam);
console.log(adam.name)

// objects are always mutable. You can add additional properties or change current ones anytime
adam.age = true// valid
adam.location = "West Virginia"; // will add a new location property to the object
console.log(adam)
adam.sayHello()

// turn a JSO into a JSON
// functions are NOT represented in the JSON
// JSON are for the state/ information of the object 
let json = JSON.stringify(adam);
console.log(json)

// Objects are a lot easier to work with
// JSON strings into objects
let adam2 = JSON.parse(json);

// protoypal inheritence
let childAdam = {name:"Adam Junior"};
// do not set prototypes this way. It is really inefficient.
childAdam.__proto__ = adam; // an object can inherit the propeties of another object
// by setting the __proto__ property to that object
childAdam.sayHello()
console.log(childAdam)

// moral of the story 
// for functions that are methods use the this keyword
/// for fucntions that do not use the this keyword use arrow notation

//JS before classes
// constructor function to create objects

    function Person(name ="", age =0){
        this.name = name;
        this.age = age;
        this.welcome = function(){
            console.log("hello I am " + this.name)
        }
    }

let kevin = new Person("Kevin", 25)
kevin.welcome()

// JS since es6 has Classes (I reccomend )
// clases are technically a really fancy function
class Employee{
    
    eId;
    fname;
    lname;
    department;

    constructor(eId,fname,lname,department){
        this.eId= eId;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    describeSelf(){
        console.log('Hi my name is ' +this.fname)
        console.log('I work in ' +this.department)
    }

}

let mary = new Employee(101,"Mary","Sue","finance")
console.log(mary);
mary.describeSelf()
