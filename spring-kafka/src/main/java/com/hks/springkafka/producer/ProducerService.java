package com.hks.springkafka.producer;

/**
 * @Author: hekuangsheng
 * @Date: 2018/11/6
 */
public interface ProducerService {
    void send(String topic, String str, int count);
    void sendJson(String topic, String json, int count);
}