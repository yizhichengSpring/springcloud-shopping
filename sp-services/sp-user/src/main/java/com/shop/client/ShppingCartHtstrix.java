package com.shop.client;

import com.shop.vo.SPShoppingCartVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
