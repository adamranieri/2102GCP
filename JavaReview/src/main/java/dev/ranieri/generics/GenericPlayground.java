package dev.ranieri.generics;

public class GenericPlayground {

    public static void main(String[] args) {
        // The problem
        // Strongly typed languages you ALWAYS need to specify the TYPE of something
        // Sometimes you will not know the TYPE of something until runtime

        String s = "Hello I am a string";
        Integer i = 10000;

        Box<String> b1 = new Box<String>();
        b1.setSomething(s);
        System.out.println(b1.getSomething());

        Box<Integer> b2 = new Box<Integer>();
        b2.setSomething(i);
        System.out.println(b2.getSomething());

        // if I tried to get something out of the box it will be of type Object
        String s2 = b1.getSomething(); // this will work only if it really IS of type String
        // casting is usually frowned upon it makes your code UNSAFE at runtim


    }
}
