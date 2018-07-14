package com.heller.hello.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * RabbitListener 监听来自名字为hello的Queue的消息
 */
@RabbitListener(queues = "hello")
@Component
public class Receiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver : " + msg);
    }

}
