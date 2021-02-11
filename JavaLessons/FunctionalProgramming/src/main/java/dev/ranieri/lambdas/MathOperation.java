package dev.ranieri.lambdas;

// to write a lambda you make an inteface with one and ONLY one abstract method
@FunctionalInterface // enforces that this interface is used to create lambdas
// you will get a compiler error if you try to add another method
public interface MathOperation {

    double compute(double num1, double num2);

}
