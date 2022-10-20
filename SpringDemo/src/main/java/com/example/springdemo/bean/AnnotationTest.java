package com.example.springdemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationTest {
    @Value("注解名")
    private String name;
    @Value("注解路径")
    private String path;

}
