package dev.ranieri.scoping;

public class ScopePlayground {

    public static void main(String [] args){
        // 1 car class
        // 2 instances of that class
        // 2 Car objects
        Car crosstrek = new Car("Subaru","Crosstrek",30000); // new keyword EXPLICITLY means allocate memory for a new object
        crosstrek.mileage = 999999;

        Car prius = new Car();
        prius.make = "Toyota";
        prius.model = "Prius";
        prius.mileage = 20;

        // there are two car objects in memory
        crosstrek.showStats();
        crosstrek.drive(100);
        crosstrek.showStats();
        prius.showStats();


        System.out.println(Car.carCounter);


    }

}
