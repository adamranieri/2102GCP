package dev.ranieri.collectionsfun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparisonPlayground {

    public static void main(String[] args) {

        // in our main code we just say what we want
        // we do not need to know the implementation
        // You as a developer do not need to know what specific class you need
        List<Object> objectList = ArrayFactory.createList(1);

        double start;
        double end;

        start = System.nanoTime();
        for (int i =0; i<100_000;i++){
            objectList.add(new Object()); // add with no other arguments adds to the end of the list
        }
        end = System.nanoTime();
        System.out.println("Time to add 100,000 objects to the end of the list " + (end-start)/1_000_000_000);

        start = System.nanoTime();
        for (int i =0; i<100_000;i++){
            objectList.get(50000); // get the object in the middle
        }
        end = System.nanoTime();
        System.out.println("Time to get the middle object 100,000 times  " + (end-start)/1_000_000_000);

        start = System.nanoTime();
        for (int i =0; i<100_000;i++){
            objectList.add(0, new Object()); // adds an object at index 1
        }
        end = System.nanoTime();
        System.out.println("Time to add an object 100,000 times to the front  " + (end-start)/1_000_000_000);


    }

}
