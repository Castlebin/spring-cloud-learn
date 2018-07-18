package com.heller.hello.model.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {

    private Long id;

    private String username;

    @JsonIgnore
    private String password;

    private Date birthday;

    private String nick;

}
