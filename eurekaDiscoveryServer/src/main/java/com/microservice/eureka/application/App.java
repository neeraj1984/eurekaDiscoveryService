package com.microservice.eureka.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class App {
	
	final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
    	logger.info("starting app....");
        SpringApplication.run(App.class, args);
    }

}