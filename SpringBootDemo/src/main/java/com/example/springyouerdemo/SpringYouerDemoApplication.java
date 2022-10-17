package com.example.springyouerdemo;

import com.example.springyouerdemo.config.StorageProperties;
import com.example.springyouerdemo.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
@MapperScan(basePackages = {"com.example.springyouerdemo.mapper", "com.example.springyouerdemo.mapper2"})
public class SpringYouerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringYouerDemoApplication.class, args);
    }

    /**
     * 创建文件夹来处理文件的上传
     *
     * @param storageService
     * @return
     */
    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
