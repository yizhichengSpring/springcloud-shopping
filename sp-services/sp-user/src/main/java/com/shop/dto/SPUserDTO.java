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
public class SPUserDTO {

    private String name;
    private String mobile;
    private String email;
    private String address;
    private Integer delFlag;


    public SPUserDTO(String name, String mobile, String email, String address) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.delFlag = 0;
    }
}
