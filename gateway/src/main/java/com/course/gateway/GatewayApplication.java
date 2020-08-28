package com.course.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

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
    /**
     * 配置跨域
     * @return
     */
    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(Boolean.TRUE);
        config.addAllowedMethod("*");
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }
}
