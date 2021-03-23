package dev.ranieri.reflections;

import java.lang.reflect.Field;

public class SideCode {
    // a static block will execute before the main method in this class
    public static void  helloWorldReflection(){
        try {
            Field[] fields = HelloWorld.class.getDeclaredFields();
            for(Field f : fields){
                System.out.println(f);
                if(f.isAnnotationPresent(Hello.class)){
                    f.setAccessible(true);
                    System.out.println(f.getName());
                    f.set(String.class,"Reflcetion Hello");
                };
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
