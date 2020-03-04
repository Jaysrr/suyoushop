package com.kxg.suyoushop.consumer;

import com.kxg.suyoushop.service.DemoService;

import org.apache.dubbo.config.annotation.Reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DubboConsumerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootstrap.class,args);
    }
}
