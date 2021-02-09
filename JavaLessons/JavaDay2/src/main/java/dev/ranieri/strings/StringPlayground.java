package dev.ranieri.strings;

public class StringPlayground {

    public static void main(String[] args) {



        int x = 100;
        double y = 100;
        // comaprisons in Java using ==
        // for primtive values == does a straight value comparison
        System.out.println(x==y);// true

        // for objects == compares their memory address
        // == for objects is used to see if it is the same exact object (NOT THE SAME VALUES)
        Person p1 = new Person("Adam",19);
        Person p2 = new Person("Adam",19);
        System.out.println(p1==p2);//false
        Person p3 = p1;
        System.out.println(p3==p1);//true
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        String name1 = "adam";
        String name2 = "adam";
        System.out.println(name1==name2);
        // true (but not because the characters are necessarily equal but because name1 and name2 are the same object)
        // String pool, a  memory optimization by Java. Two strings with the same characters will point to the same object
        // String pool is where all string live

        String s1 = new String("Hello"); // explicitly made new string objects in memory
        String s2 = new String("Hello"); // I cannot think of a reason you would want to do this
        System.out.println(s1==s2);//false

        // Strings are immutable once you create a string you cannot change it
        String fname = "Adam";
        String lname= "Ranieri";
        String fullName = fname + lname;
        System.out.println(fullName);

        // operations involving manipulating strings can be very slow


    }
}
