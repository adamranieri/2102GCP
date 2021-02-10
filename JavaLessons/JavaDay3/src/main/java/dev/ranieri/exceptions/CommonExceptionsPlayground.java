package dev.ranieri.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommonExceptionsPlayground {

    // Exceptions occur when something fails or does not execute along the 'happy path' (intended no problems execution)
    // Exceptions should be recoverable. Defensive programming. If something goes wrong you should try to respond to it


    public static void main(String[] args) {

        // An exception is an object
        // Special in that it is a 'throwable' object
        // Exception carries information about what went wrong and where

        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add two numbers");
        System.out.println("type the first number");
        int num1 = scan.nextInt();

        if (num1 == 999){
            throw  new ArithmeticException("Haha invalid number because I say so"); // code will jump to the approriate catch block
        }

        System.out.println("type the second number");
        int num2 = scan.nextInt();

        System.out.println("the sum is " + (num1 +num2));
        }catch (InputMismatchException e){
            System.err.println("OH NO THAT WAS NOT A VALID NUMBER");
            e.printStackTrace(); // an exception is an object that holds information on where and how something failed
            System.out.println(e);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            ae.printStackTrace();
            System.out.println("Somehow you got an arithmetic exception");
        }finally {
            // used often to ensure something happens (closing open resources)
            System.out.println("A finally block ALWAYS executes regardless of exceptions occurring or not");
        }

        // Common exceptions and how they occur
        // InputMismatch A one type is expected but recieved another
        // IllegalArgument A method exepcted on type but recieved another
        // ArrayIndexOutOfBounds you access an element in an array that does not exist
        // NullPointer call a method or access a field on an object that is null

//        String s = "hello";
//        s = null;
//        s.length();


    }
}
