package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author yi
 * @ClassName com.shop.SPUserApplication
 * @Description TODO
 * @Date
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableJpaAuditing
@EnableCircuitBreaker
public class SPUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SPUserApplication.class,args);
    }
}
