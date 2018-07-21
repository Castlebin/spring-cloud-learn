package com.heller.hello.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 直接测试web层，不启动一个完整的web服务（其实也差不多了 almost the full stack）
 * 使用Spring的MockMvc by @AutoConfigureMockMvc注解
 *
 * Another useful approach is to not start the server at all,
 * but test only the layer below that,
 * where Spring handles the incoming HTTP request and hands it off to your controller.
 * That way, almost the full stack is used, and your code will be called exactly the same way
 * as if it was processing a real HTTP request, but without the cost of starting the server.
 *
 * To do that we will use Spring’s MockMvc, and we can ask for that to be injected for us
 * by using the @AutoConfigureMockMvc annotation on the test case:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void sayHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello/sayHello?name=heller").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello, heller")));
    }

}
