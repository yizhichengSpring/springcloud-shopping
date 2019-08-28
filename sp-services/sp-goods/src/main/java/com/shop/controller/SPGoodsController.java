package com.shop.controller;

import com.alibaba.fastjson.JSON;
import com.shop.dto.SPGoodsDTO;
import com.shop.entity.SPGoods;
import com.shop.service.SPGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yi
 * @ClassName SPGoodsController
 * @Description TODO
 * @Date
 **/
@RestController
@RequestMapping("/goods")
public class SPGoodsController {

    @Autowired
    private SPGoodsService spGoodsService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addGoods(SPGoodsDTO goodsDTO) {
        spGoodsService.addGoods(goodsDTO);
    }


    @RequestMapping(value = "/upd",method = RequestMethod.POST)
    public void updGoods(SPGoodsDTO goodsDTO) {
        spGoodsService.updGoods(goodsDTO);
    }

    @RequestMapping(value = "/lst")
    public String getList() {
        List<SPGoods> spGoodsDTOS = spGoodsService.getAll();
        return JSON.toJSONString(spGoodsDTOS);
    }


    @RequestMapping(value = "/del")
    public void delGoods(Long id) {
        spGoodsService.delGoods(id);
    }


    @RequestMapping("/one")
    public String getOne(Long id) {
        return JSON.toJSONString(spGoodsService.getById(id));
    }


}
