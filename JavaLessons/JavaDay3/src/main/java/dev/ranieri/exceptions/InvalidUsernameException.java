package dev.ranieri.exceptions;

import java.util.HashSet;
import java.util.Set;

// Checked Exception now that it inherits from Exception not RuntimeExcpetion
// Checked exception is a Java feature where you can MANDATE that their be a try catch block to handle it being thrown
public class InvalidUsernameException extends Exception{

    InvalidUsernameException(String message){
        super(message);
    }

}
