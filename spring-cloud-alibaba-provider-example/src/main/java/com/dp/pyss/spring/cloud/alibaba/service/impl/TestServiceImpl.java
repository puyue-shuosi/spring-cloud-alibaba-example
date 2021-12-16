package com.dp.pyss.spring.cloud.alibaba.service.impl;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.dp.pyss.spring.cloud.alibaba.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author: dupei
 * @date: 2020/5/8 15:50
 */
@DubboService(protocol = "dubbo")
public class TestServiceImpl implements TestService {
    @Value("${test}")
    private String sss;
    @Override
    public String test() {
        System.out.println(sss);
        return "hello world";
    }
}
