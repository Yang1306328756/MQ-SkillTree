package com.hks.springrabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: hekuangsheng
 * @Date: 2018/10/12
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver1 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessageReceiver1  : " +msg);
    }

}