package com.shop.service.impl;

import com.shop.dao.SPGoodsDao;
import com.shop.dto.SPGoodsDTO;
import com.shop.entity.SPGoods;
import com.shop.service.SPGoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author yi
 * @ClassName SPGoodsServiceImpl
 * @Description TODO
 * @Date
 **/
@Service
public class SPGoodsServiceImpl implements SPGoodsService {

    @Autowired
    private SPGoodsDao spGoodsDao;

    @Override
    public List<SPGoods> getAll() {
        return spGoodsDao.findAll();
    }

    @Override
    public SPGoods getById(Long id) {
        Optional<SPGoods> spGoods =spGoodsDao.findById(id);
        return spGoods.get();
    }

    @Override
    public void addGoods(SPGoodsDTO goodsDTO) {
        SPGoods goods = new SPGoods();
        BeanUtils.copyProperties(goodsDTO,goods);
        spGoodsDao.save(goods);
    }

    @Override
    public void updGoods(SPGoodsDTO goodsDTO) {
        Optional<SPGoods> spGoods =spGoodsDao.findById(goodsDTO.getId());
        SPGoods goods = spGoods.get();
        BeanUtils.copyProperties(goodsDTO,goods);
        spGoodsDao.save(goods);
    }

    @Override
    public void delGoods(Long id) {
        spGoodsDao.deleteById(id);
    }
}
