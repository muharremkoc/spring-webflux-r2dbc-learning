package com.webflux.springwebfluxr2dbclearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class SpringWebfluxR2dbcLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebfluxR2dbcLearningApplication.class, args);
    }

}
