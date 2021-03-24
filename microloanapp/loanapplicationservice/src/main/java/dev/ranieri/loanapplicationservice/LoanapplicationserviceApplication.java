package dev.ranieri.loanapplicationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LoanapplicationserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(LoanapplicationserviceApplication.class, args);
	}

}
