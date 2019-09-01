package com.shop.controller;

import com.alibaba.fastjson.JSON;
import com.shop.service.SPShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi
 * @ClassName SPShoppingCartController
 * @Description TODO
 * @Date
 *
 **/
@RestController
@RequestMapping("/shoppingcart")
public class SPShoppingCartController {

    @Autowired
    private SPShoppingCartService spShoppingCartService;


    @RequestMapping("/getShoppingCartByUserId")
    public String getShoppintCartByUserId(Long userId) {

        return JSON.toJSONString(spShoppingCartService.getAllByUserId(3L));
    }
}
