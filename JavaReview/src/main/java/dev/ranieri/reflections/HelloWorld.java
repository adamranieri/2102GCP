package dev.ranieri.reflections;

import java.lang.reflect.Field;

public class HelloWorld {

    @Hello
    public static String greeting;

    public static void main(String[] args) {
        SideCode.helloWorldReflection(); // the reflection code I wrote in the other class will edit the field
        System.out.println(greeting);
    }
}
