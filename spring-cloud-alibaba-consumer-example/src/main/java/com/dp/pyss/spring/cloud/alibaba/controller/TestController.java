package com.dp.pyss.spring.cloud.alibaba.controller;

import com.dp.pyss.spring.cloud.alibaba.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dupei
 * @date: 2020/5/8 15:47
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Reference
    TestService testService;

    @GetMapping("")
    public String test(){
        return testService.test();
    }
}
