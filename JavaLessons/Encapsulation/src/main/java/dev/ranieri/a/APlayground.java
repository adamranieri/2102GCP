package dev.ranieri.a;

public class APlayground {

    public static void main(String[] args) {

        // Access Modifiers exist because in large application you want to hide certain methods and variables
        // HAS nothing to do with security
        // Protecting those methods and variables from developers using them inappropriately

        Shape s = new Shape();
        s.pubMethod(); // can be seen anywhere in your project
        s.proMethod(); // can be seen because it is the same package
        s.defMethod(); // can be seen because it is the same package

    }

}
