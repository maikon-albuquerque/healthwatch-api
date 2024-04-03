package com.github.maikonalbuquerque.healthwatchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HealthwatchApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthwatchApiApplication.class, args);
    }

}
