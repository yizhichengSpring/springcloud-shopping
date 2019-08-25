package com.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author yi
 * @ClassName SPUser
 * @Description TODO
 * @Date
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sp_user")
public class SPUser {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mobile;

    private String email;

    private String address;

    @Basic
    @Column(name = "del_flag", nullable = false)
    private Long delFlag;




}
