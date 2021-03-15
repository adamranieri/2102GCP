package dev.ranieri.app;

import dev.ranieri.configs.AppConfig;
import dev.ranieri.models.Box;
import dev.ranieri.models.Donut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // Creates an IoC container that holds the beans defined in that configuration class
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        // this will get a bean defined in the IoC container
//        Box highBox = ac.getBean("highBox", Box.class);
//        Box highBox2 = ac.getBean("highBox", Box.class);
//
//        Box lowBox1 = ac.getBean("lowBox", Box.class);
//        Box lowBox2 = ac.getBean("lowBox", Box.class);
//        Box lowBox3 = ac.getBean("lowBox", Box.class);
//
//        System.out.println(highBox);
//        System.out.println(highBox2);
//        System.out.println(lowBox1);
//        System.out.println(lowBox2);
//        System.out.println(lowBox3);

        Donut strawberry = ac.getBean("StrawberrySwirl",Donut.class);
        Donut blueberry = ac.getBean("BlueberryBlast",Donut.class);

        System.out.println(strawberry);
        System.out.println(blueberry);

    }
}
