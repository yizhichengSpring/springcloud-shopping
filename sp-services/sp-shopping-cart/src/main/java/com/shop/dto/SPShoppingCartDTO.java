package com.shop.dto;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yi
 * @ClassName SPShoppingCartDTO
 * @Description TODO
 * @Date
 **/
@Data
public class SPShoppingCartDTO {

    private Long id;

    private Long userId;

    private Long goodsId;

    private Integer delFlag;

    private String createTime;

    private String editTime;

}
