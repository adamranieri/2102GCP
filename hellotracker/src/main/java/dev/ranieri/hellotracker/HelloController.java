package dev.ranieri.hellotracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    static int counter =0;

    @GetMapping("/hello")
    public String hello(){
        return "Hello you are request number: " + ++counter;
    }
}
