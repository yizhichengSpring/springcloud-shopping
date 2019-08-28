package com.shop.service;

import com.alibaba.fastjson.JSON;
import com.shop.Application;
import com.shop.dto.SPGoodsDTO;
import com.shop.entity.SPGoods;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yi
 * @ClassName GoodsServiceTest
 * @Description TODO
 * @Date
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Slf4j
public class GoodsServiceTest {

    @Autowired
    private SPGoodsService goodsService;


    @Test
    public void addGoods() {
        SPGoodsDTO goods = new SPGoodsDTO();
        goods.setCategory("电器");
        goods.setGoodsName("iphonex");
        goods.setGoodsPrixe(new BigDecimal(9000));
        goods.setGoodsRemark("123");
        goods.setGoodsThumb("htpps://www.baidu.com");
        goodsService.addGoods(goods);

    }


    @Test
    public void getGoodsList() {
        List<SPGoods> goods = goodsService.getAll();
        log.info(JSON.toJSONString(goods));
    }


    @Test
    public void getGoodsOne() {
        SPGoods goods = goodsService.getById(6L);
        log.info(JSON.toJSONString(goods));
    }
}
