package com.shop.service;


import com.shop.dto.SPGoodsDTO;
import com.shop.entity.SPGoods;

import java.util.List;

public interface SPGoodsService {

    List<SPGoods> getAll();


    SPGoods getById(Long id);


    void addGoods(SPGoodsDTO goodsDTO);


    void updGoods(SPGoodsDTO goodsDTO);


    void delGoods(Long id);
}
