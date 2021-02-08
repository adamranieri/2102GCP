package dev.ranieri.conventions;

// Classes are named via PascalCase
// Each word is capitalized, ScientificCalculator, FireDepartment
public class ConventionPlayground {

    public static void main(String [] args){
        // variables are camel case
        String name = "Adam Ranieri";
        String firstName = "Adam";
        String lastName = "Ranieri";

        // for constants and enums you can use all caps
        // there is no real const in Java it is final
        final String NAME = "Adam";

        // snake case DO NOT USE in JAVA (can be used for enums)
        String full_name = "Adam C. Ranieri";
        // Does not compile Kebab Case
       // String full-name = "Adam Ranieri";

        // do not use $ in names
        String $ = "Do not do";

        sayHello();
    }

    // methods are named in camel case first word not capitalized, the rest are
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void sayHelloToEveryone(){
        System.out.println("Hello Everyone");
    }

}
