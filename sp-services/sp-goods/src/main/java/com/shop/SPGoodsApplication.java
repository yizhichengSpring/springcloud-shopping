package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author yi
 * @ClassName SPGoodsApplication
 * @Description TODO
 * @Date
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableJpaAuditing
@EnableCircuitBreaker
public class SPGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SPGoodsApplication.class,args);
    }
}
