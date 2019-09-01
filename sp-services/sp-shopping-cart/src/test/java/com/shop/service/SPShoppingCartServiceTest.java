package com.shop.service;

import com.alibaba.fastjson.JSON;
import com.shop.Application;
import com.shop.dto.SPShoppingCartDTO;
import com.shop.entity.SPShoppingCart;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yi
 * @ClassName SPShoppingCartServiceTest
 * @Description TODO
 * @Date
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Slf4j
public class SPShoppingCartServiceTest {

    @Autowired
    private SPShoppingCartService spShoppingCartService;


    @Test
    public void add() {
        SPShoppingCartDTO spShoppingCartDTO = new SPShoppingCartDTO();
        spShoppingCartDTO.setId(1L);
        spShoppingCartDTO.setUserId(2L);
        spShoppingCartDTO.setGoodsId(3L);
        spShoppingCartService.save(spShoppingCartDTO);
    }


    @Test
    public void getList() {
        List<SPShoppingCart> spShoppingCarts = spShoppingCartService.getAll();
        log.info(JSON.toJSONString(spShoppingCarts));
    }

    @Test
    public void getOne() {
        SPShoppingCart spShoppingCart = spShoppingCartService.getOne(2L);
        log.info(JSON.toJSONString(spShoppingCart));
    }

    @Test
    public void update() {
        SPShoppingCartDTO spShoppingCartDTO = new SPShoppingCartDTO();
        spShoppingCartDTO.setId(2L);
        spShoppingCartDTO.setGoodsId(22L);
        spShoppingCartDTO.setUserId(33L);
        spShoppingCartDTO.setDelFlag(0);
        spShoppingCartService.upd(spShoppingCartDTO);
    }

    @Test
    public void shoppingCartByUserId() {
        List<SPShoppingCart> spShoppingCarts = spShoppingCartService.getAllByUserId(33L);
        log.info(JSON.toJSONString(spShoppingCarts));
    }
}
