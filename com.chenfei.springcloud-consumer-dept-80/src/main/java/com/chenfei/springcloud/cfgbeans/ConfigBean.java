package com.chenfei.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /*
    * RestTemplate提供了多种便捷访问远程HTTP服务的方法
    * 是一种简单的访问restful服务模板类，是spring提供的用于访问rest服务的客户端模板工具类
    * */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
