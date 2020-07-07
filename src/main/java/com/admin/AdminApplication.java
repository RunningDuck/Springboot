package com.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication {

    private static final Logger logger = LoggerFactory.getLogger(AdminApplication.class);

    public static void main(String[] arg){
        SpringApplication.run(AdminApplication.class,arg);
        logger.info("AdminApplication start success!");
    }
}
