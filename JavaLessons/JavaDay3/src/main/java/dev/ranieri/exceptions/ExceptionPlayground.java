package dev.ranieri.exceptions;

import java.util.Scanner;

public class ExceptionPlayground {

    // We have been tasked with writing an appliation that people will use to create a username
    // The application will tell people if it is a valid username or not
    // 1. The username is at least 6 characters long
    // 2. The username cannot contain the characters !, #
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // scanner is used to read in input from the user
        System.out.println("Welcome to the username validator app!! Enter you username");
        String username = scan.next(); // read in a typed input

        // you only know that it failed
        // You do not know WHY this failed
        // Any part of your application that calls a method that might throw a checked exception must
        // handle it for the code to compile
        // Checked exceptions exist soley to develop code that enforce programmers to account for failure
        try {
            isValidUsername(username);
        }catch (InvalidUsernameException e){
            System.out.println("sorry does not work for the follow region " + e.getMessage());
        }

    }

    // Any NON-RUNTIME exception must be delcared as possibly being thrown in the method signature
    static boolean isValidUsername(String username) throws  InvalidUsernameException{
        if(username.length()<6){
            throw new InvalidUsernameException("Length was too short! needs to be at least 6 was " + username.length());
        }
        if(username.contains("!") || username.contains("#")){
            throw new InvalidUsernameException("Invalid username contained an illegal character ! #");
        }
        return true;
    }
}
