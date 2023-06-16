package com.ldf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan(basePackages="com.ldf.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(DemoApplication.class, args);
    }

}
