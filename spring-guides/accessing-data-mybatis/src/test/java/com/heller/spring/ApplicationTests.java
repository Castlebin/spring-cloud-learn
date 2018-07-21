package com.heller.spring;

import com.heller.spring.entity.User;
import com.heller.spring.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Rollback
    @Test
    public void contextLoads() {
        userMapper.insert("LiLei", "lilei@gmail.com");

        List<User> userList = userMapper.findByName("LiLei");
        userList.forEach(user -> {
            System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail());
            Assert.assertEquals("LiLei", user.getName());
        });
    }

}
