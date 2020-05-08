package com.dp.pyss.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringCloudAlibabaProviderExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudAlibabaProviderExampleApplication.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }

}
