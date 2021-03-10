// A callback function is any function that is passed as a parameter to another function


let hola = (name)=>{
    console.log(`Hola ${name}`)
}

let gutentag = (name)=>{
    console.log(`Gutentag ${name}`)
}

hola("Tim")
gutentag("Mike")

// language is a callback function
function languageGreeter(name, language){
    language(name) 
}

languageGreeter("Julia",gutentag) // hola is the callback function
//17 gutentag("julia")
languageGreeter("Homer",hola) // hola is the callback function
//17 hola("homer")

// arrays are a SUPER common place to see arrays
let figthers = ["Peach", "Zelda", "Mario", "Kirby", "Dark Pitt", "Fox McCloud"];

for(let figther of figthers){
    console.log(figther)
}

let print = (something) =>{
    console.log(something)
}
figthers.forEach(print) // call the print function and pass in each element one at a time
//print("Peach"); print("Zelda"); print("Mario").....

// anonymous callback function
// anonymous beacause it was never assigned a name
figthers.forEach((something) =>{
    console.log("anonymous " + something)
});
// identical to the print

let nums = [10,25,-40,70,-10,53,-4];
// sort these numbers high to low

function sortDescending(num1, num2){
    if(num1<num2){
        return 1;
    }
    if(num1>num2){
        return -1;
    }
    return 0;
}

nums.sort(sortDescending);
console.log(nums)

// filter is a function that takes in a callback function
// if that function returns true that element will be returned 

function isNegative(num1){
    if(num1<0){
        return true
    }else
    return false;
}

let negNumbers = nums.filter(isNegative); // returns a new array
console.log(negNumbers)

// I want an array of celcius numbers
let temperaturesF = [100,303,21,45,64,0,-40,80];

function farenheitToCelcius(tempF){
    let c = (tempF-32)*5/9
    return c;
}
let cTemps = temperaturesF.map(farenheitToCelcius); // map returns a new array of each value
// having been run through your callback function

// [100,303,21,45,64,0,-40,80] mapped via farenheitToCelcius into [37.77, 150.55, -6.1, 7.2, 17.778, -17.777, -40, 26.6]
// map is more akin to transform

console.log(cTemps)

// functional programming leads to easy chaining 
// all below 0 degree celcius temperatures
let freezingTemps = temperaturesF.map(farenheitToCelcius).filter(isNegative);

console.log(freezingTemps)

// A higher order function is the function that takes in a calback function
// map, filter, forEach are all higher order functions