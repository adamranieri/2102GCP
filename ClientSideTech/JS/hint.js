function outer(){

    let value = 0;

    let inner = function (){
        value++;
        console.log(value);
    }

    let showValue = function(){
        console.log("my value" +value)
    }

    return {
        fun: inner,
        show:showValue
    };

}

// in memory there are TWO different value variables in memory
// with two DIFFERENT Functions that points to the different values in memory

let Player = function(nameArg,positionArg){

    let name = nameArg;
    let position = positionArg;

    let describeSelf = function(){
        console.log(`Hi my name is ${name} and I play ${position}`)
    }

    let changePosition = function(newPosition){
        position = newPosition;
    }

    return {
        describeSelf:describeSelf, 
        changePosition:changePosition
    }

}

let adam = Player("Adam Ranieri","Center");
adam.describeSelf()
adam.changePosition("Forward")
adam.describeSelf()