package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yi
 * @ClassName SPGetwayApplication
 * @Description TODO
 * @Date
 **/
@EnableZuulProxy
@SpringCloudApplication
public class SPGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SPGetwayApplication.class,args);
    }
}
