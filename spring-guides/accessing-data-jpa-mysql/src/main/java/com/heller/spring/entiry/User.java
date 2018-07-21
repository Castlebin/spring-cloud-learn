package com.heller.spring.entiry;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Date createTime;

    private Date updateTime;

    @PrePersist
    public void onCreate() {
        updateTime = createTime = new Date();
    }

    @PreUpdate
    public void onUpdate() {
        updateTime = new Date();
    }

}
