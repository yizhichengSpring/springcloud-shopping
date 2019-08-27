package com.shop.dao;

import com.shop.entity.SPUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SPUserDao extends JpaRepository<SPUser, Long> {


    SPUser getAllById(Long id);
}
