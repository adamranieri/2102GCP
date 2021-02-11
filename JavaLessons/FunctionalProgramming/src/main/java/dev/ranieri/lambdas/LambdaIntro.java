package dev.ranieri.lambdas;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaIntro {

    public static void main(String[] args) {

        Set<String> ssbuCharacters = new HashSet<String>();
        ssbuCharacters.add("Samus");
        ssbuCharacters.add("Fox");
        ssbuCharacters.add("Link");
        ssbuCharacters.add("Pikachu");

        // imperative programming way of printing out everyone's name
        for(String name : ssbuCharacters){
            System.out.println("A new challenger approaches " + name);
        }

        // Lambda is essentially code stored as a variable in Java
        // You can pass that code object (lambda)
        // I am storing a piece of code in the variable printName

        // This code does not run when you define it
        // this is the definition of a block of code
        // Java is a stronly typed language any lambda must be declared
        // a Consumer lambda is one that does not return anything but takes in one argument
        Consumer<String> printName = (name) ->{
            System.out.println("A functional challenger approaches " + name);
        };

        // for each element in the set invoke that printName(Element) passing in that specific element
        ssbuCharacters.forEach(printName); // the functional alternative to the imperative loop



    }
}
