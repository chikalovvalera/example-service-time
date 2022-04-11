package ru.chikalov.service.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTimeApplication.class, args);
    }
}
