// TS has some really helpful features that take advantage of JS dynamic nature

// object literl types

// this function returns an object that has these properties
    function createPerson():{name:string,age:number}{
        let steve = {name:"steven",age:30 ,profession:"Trainer"}
        return steve;
    }

let person = createPerson();

// union types which specify an OR relationship

    function random():number|string{

        const randomNumber = Math.random()
        
        if(randomNumber<0.5){
            return "I am a string"
        }else{
            return 1000;
        }        
}
let x = random();

    function getSquareRoot(num:number):number|never{

        if(num<0){
            throw "You cannot get the square"
        }
       return  Math.sqrt(num)

    }

let y = getSquareRoot(100)

// You can have value return types

function coinFlip(): "Heads"|"Tails"{
    const randomNumber = Math.random()
    return randomNumber<0.5? "Heads":"Tails"

}

let result = coinFlip();

function getStatusMessage(statusCode: 1|2|3){

}

