package dev.ranieri.abstraction;

public class Rabbit extends Animal implements Swimable, Petable{

    public Rabbit(int age) {
        super("Rabbit", age);
    }

    @Override
    void eat(){
        System.out.println("Nibble on some alfalfa");
    }

    @Override
    public void swim() {
        System.out.println("Pushes with its small paws to move a little");
    }
}
