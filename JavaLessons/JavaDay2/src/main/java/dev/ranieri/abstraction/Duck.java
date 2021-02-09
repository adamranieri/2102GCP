package dev.ranieri.abstraction;

// you can only ever extend a single class but you can implement as many interfaces as you want
public class Duck extends Animal implements Flyable, Swimable, Petable{

    public Duck( int age) {
        super("Duck", age);
    }

    @Override
    void eat() {
        System.out.println("Quacks at a human until it is thrown bread");
    }

    @Override
    public void fly() {
        System.out.println("Flaps its wings and quacks really loud");
    }

    @Override
    public void swim() {
        System.out.println("Swims by paddling it's webbed feet");
    }
}
