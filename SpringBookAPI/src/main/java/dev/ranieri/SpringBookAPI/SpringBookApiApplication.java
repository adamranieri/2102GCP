package dev.ranieri.SpringBookAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"dev.ranieri"}) // Tells Spring to check all packages for components
@EnableJpaRepositories(basePackages = {"dev.ranieri.repos"}) // Tell Spring data where your repos are
@EntityScan(basePackages = {"dev.ranieri.entities"})// Tell Spring Data where to find your entities. In base hibernate you did this in a mapping tag in the cfg.xml
@SpringBootApplication // this is a spring boot application and this is the main file
public class SpringBookApiApplication {

	public static void main(String[] args) {
		// Spring Boot is creating an application context for us and auto creating some helpful beans we might need
		SpringApplication.run(SpringBookApiApplication.class, args);
	}

}
