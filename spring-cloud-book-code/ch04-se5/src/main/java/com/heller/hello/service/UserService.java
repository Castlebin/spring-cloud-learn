package com.heller.hello.service;

import com.heller.hello.entity.User;

public interface UserService {
    User findByUsername(String username);
}
