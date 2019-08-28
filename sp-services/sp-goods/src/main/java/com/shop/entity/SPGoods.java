package com.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author yi
 * @ClassName SPGoods
 * @Description TODO
 * @Date
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "sp_goods")
public class SPGoods {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "category", nullable = false)
    private String category;

    @Basic
    @Column(name = "goods_name", nullable = false)
    private String goodsName;

    @Basic
    @Column(name = "goods_price", nullable = false)
    private BigDecimal goodsPrixe;

    @Basic
    @Column(name = "goods_thumb", nullable = false)
    private String goodsThumb;

    @Basic
    @Column(name = "goods_remark")
    private String goodsRemark;

    @Basic
    @Column(name = "del_flag",insertable = false)
    private Integer delFlag;


    @Basic
    @Column(name = "status",insertable = false)
    private Integer status;


    @Column(name = "create_time",insertable = false)
    private String createTime;


    @Column(name = "edit_time",insertable = false)
    private String editTime;






}
