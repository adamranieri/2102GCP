package dev.ranieri.scoping;

// Class vs object
// An object is an instance of a class
// A class is a blueprint for an object
// an object is essentially a data construct that has its own variables and functions that act on those variables
// functions that are attached to an object are called methods

// 4 scopes in Java
// NO GLOBAL SCOPE IN JAVA
// 1. static or class scope
// 2. instance or object scope
// 3. method scope (parameter variables)
// 4. local scope / block scope (variables defined within a method)

public class Car {

    //   these are instance variables also called fields
    //   if you create a new Car()
    //   you create an object that has these variables
    String make;
    String model;
    int mileage;

    // static variables are variables that there is only ever one copy of it
    // It is attached directly to attach
    // Does not belong to an object
    // static variables CAN CHANGE

    // static refers to the idea that this varaibles memory address never changes
    static int carCounter = 0;

    // a constructor will create an instance of the class
    // constructors MUST be named the same as the class
    // Constructors do not have a return type
    Car(String make, String model, int mileage){
       this.make = make;
       this.model = model;
       this.mileage = mileage;
       Car.carCounter++;
    }

    Car(){
        this.make ="Default car";
        Car.carCounter++;
    }

    // method
    // a function that can use those instance variables within it
    // methods are called on the object
    void showStats(){
        // the 'this' makes it explicit you are accessing the instance variable
        System.out.println("The Make is " + this.make);
        System.out.println("The model is " + this.model);
        System.out.println("The Mileage is " + this.mileage);
    }

    void drive(int miles){ // miles is a method scope variable

        String message  = "You are driving your car !!!!"; //message was defined within the drive method (local)
        //
        System.out.println(message);
        this.mileage = this.mileage + miles;
    }

    // static methods are functions that do not belong attached to an object
    // attahced to the class itself
    // logic that might make sense or be useful even if there is not object fields to modify
    static void hello(){
        // it is impossible to use the this keyword in a static method
        // becuase static methods are designed to be used directly and do not touch instance field
        // System.out.println("Hello from a static method" +this.make);
    }

    // if a function does not look at or modify an instance variable than it probably could be static
    static int kilometersToMiles(int kilometers){ // kilometers is a method scope varialbe
        int miles = (int) (kilometers *0.62);
        return miles;
    }

}
