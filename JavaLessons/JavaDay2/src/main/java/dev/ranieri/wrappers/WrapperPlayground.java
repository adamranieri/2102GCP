package dev.ranieri.wrappers;

public class WrapperPlayground {

    public static void main(String[] args) {
        // Wrapper Classes
        // wrapper classes are object version of primitives
        // they can be helpful for certain OOP situation
        // Provide certain utilities

        int i = 100;
        // less efficient than primitives for calculations
        // one of the few objects that can be created with a literal syntax
        Integer ii = 100; // Wrapper version of integer. It is an object
        Boolean boo = false;
        Short s = 10;
        Long l = 900l;
        Double d = 99.1;
        Byte y = 100;
        Character c = 'a';
        Float f = 109f;

        long start = System.nanoTime();

        for(int j = 0; j<1000;j++){
            Integer a = 1000;
            Integer b = 1000;
            Integer sum = a +b;
        }

        long end = System.nanoTime();
        System.out.println("Time to complete 1000 summataions " + (end-start));
        // primtives 13,000 nano seconds
        // wrapper objects 300,000 nano seconds (about 100 times slower)

        // wrapper classes have a lot of static utility methods
        Double.parseDouble("100.9");

        Integer int1= 1000;
        Integer int2 = 2000;

        add(int1, int2); // Unboxing  Wrapper -> primtive

        int m = 9;
        int n = 7;
        subtract(m,n);// Autoboxing  Primititive -> wrapper

        // There is an integer pool for values less than 128 Integers share the same address
        Integer aa = new Integer(100) ;
        Integer bb = new Integer(100);
        System.out.println(aa==bb);// False It is an object //

    }

    static int add(int a, int b){
        return  a + b;
    }

    static int subtract(Integer a, Integer b){
        return  a-b;
    }
}
