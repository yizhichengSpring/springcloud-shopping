package com.shop.service;

import com.shop.dao.SPShoppingCartDao;
import com.shop.dto.SPShoppingCartDTO;
import com.shop.entity.SPShoppingCart;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yi
 * @ClassName SPShoppingCartServiceImpl
 * @Description TODO
 * @Date
 **/
@Service
public class SPShoppingCartServiceImpl implements SPShoppingCartService {

    @Autowired
    private SPShoppingCartDao spShoppingCartDao;


    @Override
    public List<SPShoppingCart> getAll() {
        return spShoppingCartDao.findAll();
    }

    @Override
    public SPShoppingCart getOne(Long id) {
        return spShoppingCartDao.findById(id).get();
    }

    @Override
    public void save(SPShoppingCartDTO spShoppingCartDTO) {
        SPShoppingCart spShoppingCart = new SPShoppingCart();
        BeanUtils.copyProperties(spShoppingCartDTO,spShoppingCart);
        spShoppingCartDao.save(spShoppingCart);
    }

    @Override
    public void upd(SPShoppingCartDTO spShoppingCartDTO) {
        SPShoppingCart spShoppingCart =
                spShoppingCartDao.findById(spShoppingCartDTO.getId()).get();
        BeanUtils.copyProperties(spShoppingCartDTO,spShoppingCart);
        spShoppingCartDao.save(spShoppingCart);
    }

    @Override
    public void del(Long id) {
        SPShoppingCartDTO spShoppingCartDTO = new SPShoppingCartDTO();
        SPShoppingCart spShoppingCart =
                spShoppingCartDao.findById(id).get();
        BeanUtils.copyProperties(spShoppingCartDTO,spShoppingCart);
        spShoppingCart.setDelFlag(1);
        spShoppingCartDao.save(spShoppingCart);
    }


    @Override
    public List<SPShoppingCart> getAllByUserId(Long userId) {
        List<SPShoppingCart> spShoppingCarts = spShoppingCartDao.findAllByUserId(userId);
        return spShoppingCarts;
    }
}
