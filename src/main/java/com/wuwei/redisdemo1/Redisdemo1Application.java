package com.wuwei.redisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wuwei.redisdemo1.mapper")
public class Redisdemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Redisdemo1Application.class, args);
    }

}
