package com.ngspring.springangularintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAngularIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularIntegrationApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
