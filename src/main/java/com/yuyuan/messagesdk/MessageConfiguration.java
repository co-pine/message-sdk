package com.yuyuan.messagesdk;

import com.yuyuan.messagesdk.service.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

/**
 * @author pine
 */
@Configuration
@ComponentScan
// 导入已经在 Ioc 中的对象
@Import({EmailMessageServiceImpl.class, MpMessageServiceImpl.class, SmsMessageServiceImpl.class, WorkwxMessageServiceImpl.class})
public class MessageConfiguration {

    @Resource
    private AggregatedMessageServiceImpl aggregatedMessageServiceImpl;

    @Bean
    @ConditionalOnMissingBean(AggregatedMessageServiceImpl.class)
    public AggregatedMessageServiceImpl getAggregatedMessageServiceImpl() {
        return aggregatedMessageServiceImpl;
    }

}
