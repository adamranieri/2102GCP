package dev.ranieri.abstraction;

// Interfaces convey the ability-to hence they usually end in able
public interface Flyable {
    // all methods in an interface are abstract
    // ANY variables in an interface are always public static and final
    // usually a constant that helps in implementing the methods
    // i.e. the mathematical number pi to help implement some math methods
    void fly();
}
