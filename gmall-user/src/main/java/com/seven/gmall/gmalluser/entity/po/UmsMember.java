package com.seven.gmall.gmalluser.entity.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
public class UmsMember {
    //设置主键及主键返回策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long levelId;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String email;

    private String header;

    private Byte gender;

    private Date birth;

    private String city;

    private String job;

    private String sign;

    private Byte sourceType;

    private Integer integration;

    private Integer growth;

    private Byte status;

    private Date createTime;

}