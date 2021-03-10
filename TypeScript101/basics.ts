const fname:string = "Adam";
const num =100; // TS will infer the type if not put 

function greet(name:string){
    console.log("Hello " +name)
}

greet(fname)
// greet(num) // this gives you an error before your run your code
// the actual code 

// functions can have return types
function phraseLength(phrase:string): number{
    const length:number = phrase.length;
    return length;
}

function isEven(num:number):boolean{

    if(num%2===0){
        return true
    }else{
        return false
    }
}

isEven(90)