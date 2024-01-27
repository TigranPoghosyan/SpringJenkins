package com.example.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void init(String msg) {
        logger.info("Application started . . . " + msg);
    }

    public static void main(String[] args) {
        logger.info("Application executed . . . ");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
