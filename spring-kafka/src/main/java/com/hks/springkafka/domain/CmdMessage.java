package com.hks.springkafka.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author: hekuangsheng
 * @Date: 2018/11/6
 */
@Data
public class CmdMessage {
    // id
    private Long id;

    // 消息
    private String msg;

    // 时间戳
    private Date sendTime;
}