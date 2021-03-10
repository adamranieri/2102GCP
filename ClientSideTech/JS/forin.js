
// for in is for iterating over the properties of an object
let player ={
    name:"Steph Curry",
    height: 75,
    postion:"Point Guard",
    shootBall:function(){
        console.log("Shoot the ball")
    }
}

for(let prop in player){
    console.log(player[prop])
}