package dev.ranieri.abstraction;

public class Bear extends Animal implements Swimable{

    Bear(int age){
        super("Bear",age);
    }

    @Override
    void eat(){
        System.out.println("Robs a beehive for honey");
    }

    @Override
    public void swim() {
        System.out.println("Big strokes in the water to swim");
    }
}
