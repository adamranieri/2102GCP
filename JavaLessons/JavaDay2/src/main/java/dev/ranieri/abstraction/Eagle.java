package dev.ranieri.abstraction;

public class Eagle extends Animal implements Flyable{

    public Eagle(int age) {
        super("Eagle", age);
    }

    @Override
    void eat() {
        System.out.println("Swoops down to catch it's prey");
    }

    @Override
    public void fly() {
        System.out.println("Soars through the air majestically");
    }
}
