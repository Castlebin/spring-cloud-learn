package com.heller.hello;

import com.heller.hello.service.RedisDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.set("name", "LiLei");
        redisDao.set("age", "17");
        Assert.assertEquals(redisDao.get("name"), "LiLei");
        Assert.assertEquals(redisDao.get("age"), "17");
    }

}
