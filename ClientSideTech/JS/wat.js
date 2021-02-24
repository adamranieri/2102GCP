// broken this keyword in JS
// I think any  JS developer would say that the this keyword is broken

var person ={
    name: "Tim",
    describeSelf: function(){
        const self = this
        console.log(`Hi my name is ${this.name}`)

        let inner= function(){
            console.log(`my name is ${self.name}` )
        }
        inner()
    }
}

person.describeSelf()