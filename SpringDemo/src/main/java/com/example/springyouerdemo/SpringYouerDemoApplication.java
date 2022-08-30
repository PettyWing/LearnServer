package com.example.springyouerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.springyouerdemo.mapper")
public class SpringYouerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringYouerDemoApplication.class, args);
    }

}
