package com.ngspring.springangularintegration.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class NgSpringSpringBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NgSpringSpringBackendApplication.class, args);
    }
    
    @GetMapping(value = "/#/{path:[^\\.]*}")
    public String redirect() {
        System.out.println("\ncom.ngspring.springangularintegration.backend.NgSpringSpringBackendApplication.redirect()");
        return "forward:/";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Working 22 !!";
    }
    
}
