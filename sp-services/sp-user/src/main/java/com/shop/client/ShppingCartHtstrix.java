package com.shop.client;

import org.springframework.stereotype.Component;

/**
 * @author yi
 * @ClassName ShppingCartHtstrix
 * @Description 熔断降级策略
 * @Date
 **/
@Component
public class ShppingCartHtstrix implements ShoppingCartClient {


    @Override
    public String getShppingCartInfo(Long userId) {
        return "";
    }
}
