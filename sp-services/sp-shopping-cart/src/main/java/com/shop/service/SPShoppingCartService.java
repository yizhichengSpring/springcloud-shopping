package com.shop.service;

import com.shop.dto.SPShoppingCartDTO;
import com.shop.entity.SPShoppingCart;

import java.util.List;

public interface SPShoppingCartService {


    List<SPShoppingCart> getAll();

    SPShoppingCart getOne(Long id);


    void save(SPShoppingCartDTO spShoppingCartDTO);

    void upd(SPShoppingCartDTO spShoppingCartDTO);

    void del(Long id);

    List<SPShoppingCart> getAllByUserId(Long userId);
}
