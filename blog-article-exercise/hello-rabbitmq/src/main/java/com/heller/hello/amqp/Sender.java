package com.heller.hello.amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送msg到名字为hello的Queue
     *
     * @param msg
     */
    public void send(String msg) {
        amqpTemplate.convertAndSend("hello", msg);
    }

}
