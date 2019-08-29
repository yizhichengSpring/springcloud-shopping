package com.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author yi
 * @ClassName SPShoppingCart
 * @Description TODO
 * @Date
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "sp_shopping_cart")
public class SPShoppingCart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "goods_id", nullable = false)
    private Long goodsId;

    @Basic
    @Column(name = "del_flag", insertable = false)
    private Integer delFlag;

    @Column(name = "create_time",insertable = false, updatable = false)
    private String createTime;


    @Column(name = "edit_time",insertable = false, updatable = false)
    private String editTime;
}
