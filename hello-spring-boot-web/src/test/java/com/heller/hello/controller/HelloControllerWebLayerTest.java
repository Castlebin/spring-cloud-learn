package com.heller.hello.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 直接使用@WebMvcTest 来替换
 *
 *      @SpringBootTest
 *      @AutoConfigureMockMvc
 *
 * 这两个注解，同样是不启动完整的web服务来测试web层
 *
 * 一种简化
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerWebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/hello/sayHello?name=heller")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, heller")));
    }

}
