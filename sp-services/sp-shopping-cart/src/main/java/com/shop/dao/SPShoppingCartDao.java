package com.shop.dao;

import com.shop.entity.SPShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SPShoppingCartDao extends JpaRepository<SPShoppingCart,Long> {


    List<SPShoppingCart> findAllByUserId(Long userId);
}
