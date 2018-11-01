package com.hks.springkafka.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: hekuangsheng
 * @Date: 2018/10/30
 */
@Data
public class Message {
    // id
    private Long id;

    // 消息
    private String msg;

    // 时间戳
    private Date sendTime;

}
