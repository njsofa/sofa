package com.sofa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ServletComponentScan
public class SofaApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SofaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SofaApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Sofa Starting Successed");
    }
}
