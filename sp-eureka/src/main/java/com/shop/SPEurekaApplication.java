package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yi
 * @ClassName SPEurekaApplication
 * @Description TODO
 * @Date
 **/
@EnableEurekaServer
@SpringBootApplication
public class SPEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SPEurekaApplication.class,args);
    }
}
