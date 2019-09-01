package com.shop.service;

import com.alibaba.fastjson.JSON;
import com.shop.SPUserApplicationTest;
import com.shop.dto.SPUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @author yi
 * @ClassName SPUserServiceTest
 * @Description TODO
 * @Date
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SPUserApplicationTest.class})
@Slf4j
public class SPUserServiceTest {

    @Autowired
    private SPUserService userService;


    @Transactional
    @Test
    public void addUser() {
        SPUserDTO spUserDTO = new SPUserDTO("易志成","13141016707","13141016707@163.com","北京",0);
        userService.addUser(spUserDTO);
    }


    @Test
    public void getUserShoppingCart() {
        log.info(JSON.toJSONString(userService.getUserShoppingCart(3L)));
    }
}
