package com.heller.hello.controller.it;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * HelloController的集成测试，IT, integration test
 * 在一个随机端口启动web容器，启动了完整的web服务
 *
 * Note the use of webEnvironment=RANDOM_PORT to start the server with a random port
 * (useful to avoid conflicts in test environments),
 * and the injection of the port with @LocalServerPort.
 * Also note that Spring Boot has provided a TestRestTemplate for you automatically,
 * and all you have to do is @Autowired it.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private URL base;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = testRestTemplate.getForEntity(base.toString() + "hello/sayHello?name=heller",
                String.class);
        assertThat(response.getBody(), equalTo("Hello, heller"));
    }

}
