package dev.ranieri.primitives;

public class PrimitivePlayground {

    public static void main(String [] args){

        // Java has 8 primitives
        // 'primitive' data types, non-complex, NOT OBJECTS

        boolean boo = true; // N/A
        byte y = 125; // 1 byte
        short s = 0; // 2 bytes
        char c = 'h'; // 2 bytes numbers in disguiese
        int i = 100; // 4 bytes
        float f = 100.521f; // 4 bytes
        long l = 1000; // 8 bytes
        double d = 20000.6234; // 8 bytes

        // STRING IS NOT A PRIMITIVE. String is an object
        String hello = "Hello";

        // byte a = 2;
        // byte b = 2;
        // short z = a + b; // Java will always do arithmetic with integers

        int x =  100000;
        short shor = (short) x;
        System.out.println(x);
        char cc = 130;
        System.out.println(cc);


    }
}
