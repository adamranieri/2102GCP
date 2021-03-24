package dev.ranieri.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayserviceApplication {

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder){


		return builder.routes().route(r->r
				.path("/loanapp/loans")
				.uri("http://host.docker.internal:8080/loans")).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayserviceApplication.class, args);
	}

}
