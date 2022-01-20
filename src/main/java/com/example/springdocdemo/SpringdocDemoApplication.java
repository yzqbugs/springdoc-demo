package com.example.springdocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdocDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdocDemoApplication.class, args);
        System.out.println("http://localhost:8000/swagger-ui.html");
    }

}
