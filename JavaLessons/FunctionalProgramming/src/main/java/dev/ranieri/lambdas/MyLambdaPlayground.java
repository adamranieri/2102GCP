package dev.ranieri.lambdas;

public class MyLambdaPlayground {

    public static void main(String[] args) {

        MathOperation add = (double num1, double num2) -> {
            return  num1 + num2;
        };

        MathOperation multiply = (double num1, double num2) ->{
            return  num1 * num2;
        };

        double sum = add.compute(90,43);
        double product = multiply.compute(7,8);
        System.out.println(sum);
        System.out.println(product);

    }
}
