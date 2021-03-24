package dev.ranieri.loancrudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // tells the Spring application to register with consul and to take note of other services registerd their
@SpringBootApplication
public class LoancrudserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoancrudserviceApplication.class, args);
	}

}
