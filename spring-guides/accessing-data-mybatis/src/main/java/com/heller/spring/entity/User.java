package com.heller.spring.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {

    private Long id;

    private String name;

    private String email;

    private Date createTime;

    private Date updateTime;

}
