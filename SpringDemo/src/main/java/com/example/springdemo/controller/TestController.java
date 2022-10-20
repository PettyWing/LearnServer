package com.example.springdemo.controller;

import com.example.springdemo.bean.AnnotationTest;
import com.example.springdemo.bean.Greeting;
import com.example.springdemo.bean.XmlRootTest;
import com.example.springdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @Autowired
    AnnotationTest annotationTest;
    @Autowired
    ApplicationContext applicationContext;
    TestService testService;

    public TestController setTestService(TestService testService) {
        this.testService = testService;
        return this;
    }
    @Autowired
    TestService testService1;

    @GetMapping("/hello")
    public ModelAndView doTest1() {
        System.out.println("doTest");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean.xml");
//        XmlRootTest xmlRootTest = (XmlRootTest) context.getBean("xmlRootTest");
//        System.out.println(testService.getXmlRootTest().getName());
        return modelAndView;
    }

    @GetMapping("/greeting")
    @ResponseBody
    public Greeting dotest2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(1, "hello，" + name);
    }
}
