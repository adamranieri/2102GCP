package dev.ranieri.collectionsfun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Factory Design pattern os when we have a method that returns an implementation of an interface
// We tell the factory what we want. WE do not care the specific implementation class we recieve
// Helps build large scalable application by abstracting away implementation details
// CODE TO INTERFACES
public class ArrayFactory {

    /**  Put in 1 for a list that optimizes read efficiency. Put in anything else for a list that optimizes insertion efficiency */
    static List createList(int choice){

        if(choice == 1){
            return new ArrayList();
        }else{
            return new LinkedList();
        }

    }
}
