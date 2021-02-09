package dev.ranieri.abstraction;

public class AnimalPlayground {

    public static void main(String[] args) {

        // It impossible for something to be JUST an animal
//        Animal a = new Animal(10);
//        a.eat();
//        System.out.println(a);

        // you can NEVER make a bear not act like a bear
        Animal yogi = new Bear(70);
        yogi.eat();

        Rabbit bugsBunny = new Rabbit(90);
        bugsBunny.eat();

        Animal eagle = new Eagle(20);
        eagle.eat();
        // eagle.fly();we lost the ability to call fly

        Flyable duck = new Duck(5);
        // duck.eat(); lost the ability to eat
        duck.fly();

        Animal r = new Bear(2);

        // sometimes it helps
        System.out.println(r instanceof  Petable);

    }
}
