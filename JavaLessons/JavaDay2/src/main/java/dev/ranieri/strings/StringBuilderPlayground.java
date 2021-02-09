package dev.ranieri.strings;

public class StringBuilderPlayground {

    public static void main(String[] args) {
        //StringBuilder is a class that is designed for doing string manipulations


        StringBuilder sb1 = new StringBuilder("hello");


        long start = System.nanoTime();
        for(int i = 0; i <10000;i++){
            sb1.append("a"); // directly adds an 'a' to a stringbuilder
            // 1 stringbuilder object that is modified 10,000 times
        }
        long end = System.nanoTime();
        System.out.println("milleseoncs to complete Stringbuilder " +  (end-start));


        String s1 = "hola";
        start = System.nanoTime();
        for(int i = 0; i <10000;i++){
            s1 = s1.concat("b"); // create a brand new string in memory every single iteration
            // 10,000 different strings created
        }
        end = System.nanoTime();
        System.out.println("milleseoncs to complete String " +  (end-start));


    }
}
