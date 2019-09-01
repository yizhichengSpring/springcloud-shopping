package com.shop.client;

import com.shop.vo.SPShoppingCartVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author yi
 * @ClassName ShoppingCartClient
 * @Description TODO
 * @Date
 **/
@FeignClient(value = "sp-eureka-client-cart")
public interface ShoppingCartClient{

    @RequestMapping(value = "/sp-shopping-cart/shoppingcart/getShoppingCartByUserId",method = RequestMethod.GET)
    String getShppingCartInfo(Long userId);

}
