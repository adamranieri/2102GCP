package dev.ranieri.configs;

import dev.ranieri.models.Box;
import dev.ranieri.models.Donut;
import dev.ranieri.models.Jelly;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // This annotation marks the class as something that should be read by the Spring IoC container
@Configuration // Stereotype. A stereotype is the specific type of component
//@Configuration tells Spring that this class holds definitions for beans
public class AppConfig {

    // DO NOT CALL THESE METHODS DIRECLTY
    // THESE ARE NOT INTENDED TO BE USED BY THE PROGRAMMER
    // these methods are read as definitions for spring to bulid beans


    @Bean(name = "highBox")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // new bean is created everytime your get it from the IoC
    public Box highValueBox(){
        System.out.println("Proto Bean");
        Box box = new Box(1000);
        return box;
    }

    // by defult beans are SINGLETONS meaning there is only one instance of that bean
    // singleton beans are created as soon as the Applicaiton Context is created
    @Bean(name = "lowBox")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Box lowValueBox(){
        System.out.println("Singleton Bean");
        Box box = new Box(10);
        return box;
    }

    @Bean
    public Jelly strawberryJelly(){
        Jelly jelly = new Jelly("Organic Strawberry Jam");
        return jelly;
    }

    @Bean
    public Jelly blueberryJelly(){
        Jelly jelly = new Jelly("Gluten Free Blueberry Jam");
        return jelly;
    }

    @Bean(name = "StrawberrySwirl")
    public Donut strawberryDonut(){
        // this process is called DEPENDENCY INJECTION
        Donut donut = new Donut();
        // setter injection. You create the object then use the setters to inject the dependencies
        donut.setName("Super Strawberry Swirl");
        donut.setCost(2.25);
        donut.setJelly(this.strawberryJelly());
        return  donut;
    }

    @Bean(name = "BlueberryBlast")
    public Donut blueberryBlast(){
        // Constructor injection
        Donut donut = new Donut("Booming Blueberry Blast",2.25,this.blueberryJelly());
        return  donut;
    }


}
