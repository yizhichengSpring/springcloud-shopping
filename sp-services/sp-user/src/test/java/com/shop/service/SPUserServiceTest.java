package com.shop.service;

import com.shop.SPUserApplicationTest;
import com.shop.dto.SPUserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yi
 * @ClassName SPUserServiceTest
 * @Description TODO
 * @Date
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SPUserApplicationTest.class})
public class SPUserServiceTest {

    @Autowired
    private SPUserService userService;


    @Test
    public void addUser() {
        SPUserDTO spUserDTO = new SPUserDTO("易志成","13141016707","13141016707@163.com","北京");
        userService.addUser(spUserDTO);
    }
}
