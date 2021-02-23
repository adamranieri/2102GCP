// template literals
// quickly format strings
// remove all the + signs throughout your code

const name = "Adam Ranieri";
let greeting = `Hello ${name}`
console.log(greeting)

let adam = {
    name:"Adam Ranieri",
    age: 19,
    profession: "trainer",
    sayHello: function(){
        // string interpolation
        console.log(`Hi my name is ${this.name} I am ${this.age} years old and I work as ${this.profession}`)
    }
}

adam.sayHello()