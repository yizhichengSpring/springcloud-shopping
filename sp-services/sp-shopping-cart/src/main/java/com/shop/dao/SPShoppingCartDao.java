package com.shop.dao;

import com.shop.entity.SPShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SPShoppingCartDao extends JpaRepository<SPShoppingCart,Long> {
}
