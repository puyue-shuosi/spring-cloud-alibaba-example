package com.dp.pyss.spring.cloud.alibaba.service.impl;

import com.dp.pyss.spring.cloud.alibaba.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: dupei
 * @date: 2020/5/8 15:50
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello world";
    }
}
