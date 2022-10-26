package com.example.springdemo;

import com.example.springdemo.schema.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Test bean = ctx.getBean(Test.class);
        System.out.println(bean.toString());
    }
}
