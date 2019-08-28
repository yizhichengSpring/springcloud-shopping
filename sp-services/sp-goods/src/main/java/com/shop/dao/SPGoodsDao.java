package com.shop.dao;

import com.shop.entity.SPGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yi
 * @ClassName SPGoodsDao
 * @Description TODO
 * @Date
 **/
@Repository
public interface SPGoodsDao extends JpaRepository<SPGoods,Long> {
}
