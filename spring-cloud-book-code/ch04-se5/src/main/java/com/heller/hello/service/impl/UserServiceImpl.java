package com.heller.hello.service.impl;

import com.heller.hello.dao.UserRepository;
import com.heller.hello.entity.User;
import com.heller.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
