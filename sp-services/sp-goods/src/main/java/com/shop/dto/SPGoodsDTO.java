package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author yi
 * @ClassName SPGoodsDTO
 * @Description TODO
 * @Date
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SPGoodsDTO {

    private Long id;

    private String category;

    private String goodsName;

    private BigDecimal goodsPrixe;

    private String goodsThumb;

    private String goodsRemark;

    private Integer delFlag;

    private Integer status;


}
