package com.shop.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yi
 * @ClassName SPShoppingCartVO
 * @Description TODO
 * @Date
 **/
@Data
public class SPShoppingCartVO  {

    private Long id;

    private Long userId;

    private Long goodsId;

    private Integer delFlag;

    private String createTime;

    private String editTime;
}
