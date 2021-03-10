// History of classes and encapsulation
// The old school ALGOL languages had functions (very functionally based)
function Person(nameArg){
    
    let name = nameArg;

    // this inner function is dynamic
    // your create a brand new function object every time you call greetPerson
    let sayHello = function(){
        console.log(`Hello my name is ${name}`)
    }

    return {name,sayHello} // in JS you do not have to do property:property
}

let adam = Person("Adam")
adam.sayHello()

let steve = Person("steven")
steve.sayHello()

