// TS has types not in JS. Like void or any never
function printName(name:string):void{
    console.log(name)
}

// try to avoid the any type
// the same as just regular js
// any type is a wild card
function print(something:any){
    console.log(something)
}

// this function must never end or must never return successfully
function infiLoop():never{
    while(true){}
}

// TS supports generics for arrays
const ssbuCharacters:Array<string> = ["Peach","Zela","Mario","Pyra/Mythra"];
ssbuCharacters.push("Bowser")

// alternate syntax
const pastAssociates:string[] =["Jaxon","Peter","Maxwell"];

const tempsCelcius:string[] = ["100","200","350","-100"]

const tempsFarenheit:number[] = tempsCelcius.map((temp)=>{
    const cTemp:number = Number(temp)
    return cTemp*9/5+32
});

console.log(tempsFarenheit)


