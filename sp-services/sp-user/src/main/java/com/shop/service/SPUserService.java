package com.shop.service;

import com.shop.dto.SPUserDTO;
import com.shop.entity.SPUser;
import com.shop.vo.SPShoppingCartVO;

import java.util.List;

public interface SPUserService {

    void addUser(SPUserDTO userDTO);

    List<SPUser> getList();

    String getOne(Long id);

    void updUser(SPUserDTO userDTO);


    String getUserShoppingCart(Long userId);
}
