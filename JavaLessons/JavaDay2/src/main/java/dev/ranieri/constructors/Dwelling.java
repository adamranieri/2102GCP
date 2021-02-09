package dev.ranieri.constructors;

public class Dwelling {

    String owner;
    int area;
    // If you do not declare a constructor in a class one is provided for you
    // (if you do not have a lawyer one will be provided for you)
    // the default constructor has no arguments and is essentially just
    // Dwelling(){} Default Constructor You only get one if there are no explicit constructors defined

    // Good practice is to always use explicit constructor
    Dwelling(){
        super(); // builds the object class which is parent of everything
        System.out.println("No Args constructor in dwelling");
    }

    Dwelling(String owner, int area){
        super();
        System.out.println("Building dwelling with area " + area);
        this.owner = owner;
        this.area = area;

    }


}
