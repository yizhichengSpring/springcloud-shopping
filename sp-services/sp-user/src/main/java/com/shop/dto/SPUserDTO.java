package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yi
 * @ClassName SPUserDTO
 * @Description TODO
 * @Date
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SPUserDTO {

    private String name;
    private String mobile;
    private String email;
    private String address;
    private Integer delFlag;


}
