package dev.ranieri.exceptions;

public class ErrorPlayground {

    static  int counter =0;

    public static void main(String[] args) {
        // StackOverflowError
        // OutOfMemory // hardware that your program
        // You should NEVER catch. It is very bad practice
        // Errors are for things which are unrecoverable. Requiure you to rewrite the code
        // They should not be handled your code needs to be written to just avoid them
        try {
            overflow();
        }catch (StackOverflowError error){
            System.out.println("You caught an error!!!!" + counter);
        }


    }
    static void overflow(){
        counter++;
        overflow();
    }


}
