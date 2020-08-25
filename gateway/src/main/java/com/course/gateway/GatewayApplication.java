package com.course.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @ClassName SystemApplication
 * @Author ASUS
 * @Date 2020-08-25 19:11
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
    private static final Logger LOG= LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args){
        SpringApplication springApplication=new SpringApplication(GatewayApplication.class);
        Environment environment=springApplication.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("Gateway地址:\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}
