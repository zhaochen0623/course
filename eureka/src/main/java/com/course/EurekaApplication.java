package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

/**
 * @ClassName EurekaApplication
 * @Author ASUS
 * @Date 2020-08-24 20:09
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    private static final Logger LOG= LoggerFactory.getLogger(EurekaApplication.class);

//    public static void main(String[] args) {
//        SpringApplication.run(EurekaApplication.class,args);
//    }
    public static void main(String[] args){
        SpringApplication springApplication=new SpringApplication(EurekaApplication.class);
        Environment environment=springApplication.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("Eureka地址:\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}
