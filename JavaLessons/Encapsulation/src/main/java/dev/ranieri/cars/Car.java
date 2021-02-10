package dev.ranieri.cars;

// Encapsulation (data hiding) can be used to protect Data
// prevent it from ever having values that do not make sense
public class Car {

    private String make;
    private String model;
    private int mileage;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.mileage = 0; // int values default to 0 anyway
    }

    public void drive(int mileage){
        this.mileage = this.mileage + mileage;
        System.out.println("Driving the car");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(mileage <0){
            return; // in a void method you can return to just end the method immediately
        }
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
