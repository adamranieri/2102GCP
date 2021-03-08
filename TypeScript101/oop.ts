// TS has a lot of support of OOP than JS
// TS had classes before JS

class Person{

    // you have access modifiers in TS
    name:string
    private age:number // they cannot prevent you from accessing this field
    // they hide it in your ide

    constructor(name:string,age:number){
        this.name = name;
        this.age = age;
    }

    describeSelf(){
        console.log(`Hi my name is ${this.name} I am this old : ${this.age}`)
    }

}

const adam = new Person("Adam",19);

adam.describeSelf()

interface ScientificCalculator{

    power(base:number,exponent:number) 
    
}

class Dog{
    constructor(public owner:string, public name:string, public age:number){}
}

let clifford = new Dog("Mr Smith","Clifford",20);





