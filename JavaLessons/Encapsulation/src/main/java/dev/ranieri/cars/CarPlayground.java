package dev.ranieri.cars;

public class CarPlayground {

    public static void main(String[] args) {

        Car c = new Car("Subaru", "Crosstrek");
        System.out.println(c);
        c.drive(97);
        System.out.println(c);

        c.setMileage(-1000);
        System.out.println(c);

    }
}
