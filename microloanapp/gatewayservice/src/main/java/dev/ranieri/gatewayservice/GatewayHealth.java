package dev.ranieri.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayHealth {

    @GetMapping("/health")
    public String healthCheck(){
        return  "All is good";
    }
}
