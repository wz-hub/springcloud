package com.wz.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Ribbon  配置负载均衡 实现RestTemplate均衡
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


}
