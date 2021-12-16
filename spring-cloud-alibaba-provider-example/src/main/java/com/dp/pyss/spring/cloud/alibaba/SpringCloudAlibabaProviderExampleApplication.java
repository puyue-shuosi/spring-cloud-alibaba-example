package com.dp.pyss.spring.cloud.alibaba;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;

@EnableDiscoveryClient
@EnableAutoConfiguration
public class SpringCloudAlibabaProviderExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudAlibabaProviderExampleApplication.class)
                .run(args);
    }

}
