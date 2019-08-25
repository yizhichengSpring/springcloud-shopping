package com.shop.service.impl;

import com.shop.dao.SPUserDao;
import com.shop.dto.SPUserDTO;
import com.shop.entity.SPUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.service.SPUserService;

/**
 * @author yi
 * @ClassName SPUserServiceImpl
 * @Description TODO
 * @Date
 **/
@Service
public class SPUserServiceImpl implements SPUserService {

    @Autowired
    private SPUserDao userDao;

    @Override
    public void addUser(SPUserDTO userDTO) {
        SPUser user = new SPUser();
        BeanUtils.copyProperties(userDTO,user);
        userDao.save(user);
    }
}
