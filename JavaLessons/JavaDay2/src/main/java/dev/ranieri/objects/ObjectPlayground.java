package dev.ranieri.objects;

public class ObjectPlayground {

    // Every class in Java inherits from the Object Class
    // grandparent class of everything
    public static void main(String[] args) {
        Object a = "hello"; // String is an object
        Object b = new Integer(100);
        int [] nums = {1,2,3,4,5}; // an array is an object
        Object o = nums;

        // important methods of Object
        // .toString()
        // .equals() // returns a boolean // you decide when something is true or not


        Student adam =  new Student("Adam", 10);
        System.out.println(adam.toString());
        System.out.println(adam); // identical lines of code
        // any object in a print statement will automatically called toString called on it

        Student sam = new Student("Sam",10);
        System.out.println(sam.equals(a));

    }
}
