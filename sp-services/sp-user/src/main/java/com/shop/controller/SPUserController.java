package com.shop.controller;

import com.alibaba.fastjson.JSON;
import com.shop.dto.SPUserDTO;
import com.shop.entity.SPUser;
import com.shop.service.SPUserService;
import com.shop.vo.SPShoppingCartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yi
 * @ClassName SPUserController
 * @Description TODO
 * @Date
 **/
@RestController
@RequestMapping("/user")
public class SPUserController {

    @Autowired
    private SPUserService userService;

    @PostMapping("/add")
    public int add(SPUserDTO userDTO) {
        userService.addUser(userDTO);
        return 1;
    }

    @GetMapping("/lst")
    public List<SPUser> getList() {
        return userService.getList();
    }


    @RequestMapping("/one/{id}")
    public String getOne(@PathVariable("id") Long id) {
        return JSON.toJSONString(userService.getOne(id));
    }


    @PostMapping("/upd")
    public int upd(SPUserDTO userDTO) {
        userService.updUser(userDTO);
        return 1;
    }

    @RequestMapping("/getUserShppingCart/{userId}")
    public String getUserShppingCart(@PathVariable("userId") Long userId) {
       String str =  userService.getUserShoppingCart(userId);
       return JSON.toJSONString(str);
    }
}
