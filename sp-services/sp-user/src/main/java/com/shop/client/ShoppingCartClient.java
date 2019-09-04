package com.shop.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yi
 * @ClassName ShoppingCartClient
 * @Description TODO
 * @Date
 **/
@FeignClient(value = "sp-eureka-client-cart",fallback = ShppingCartHtstrix.class)
public interface ShoppingCartClient{

    @RequestMapping(value = "/sp-shopping-cart/shoppingcart/getShoppingCartByUserId",method = RequestMethod.GET)
    String getShppingCartInfo(Long userId);

}
