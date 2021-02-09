package dev.ranieri.constructors;

// inheriting the fields and methods of Dwelling
public class House extends Dwelling{

    int walls;

    House(){
        super();// the first line of any constructor is super Java does this automatically so not always mandatory
        // building a dwelling
        System.out.println("No args house constructor");
        this.walls  = 4;
    }
    House(String owner,  int area, int walls){
        super(owner,area); // builds a dwelling with those parameters
        this.walls = walls;
        System.out.println("built house with this many walls : " + walls);
    }

}
