package com.hks.springkafka.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hekuangsheng
 * @Date: 2018/11/6
 */
@Configuration
@Data
public class PropsConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String broker;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Value("${spring.kafka.consumer.auto-offset-reset}")
    private String autoOffsetReset;

    @Value("${spring.kafka.consumer.enable-auto-commit}")
    private String enableAutoCommit;

}
