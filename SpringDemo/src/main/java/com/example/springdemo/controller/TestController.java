package com.example.springdemo.controller;

import com.example.springdemo.bean.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/hello")
    public ModelAndView doTest1() {
        System.out.println("doTest");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @GetMapping("/greeting")
    @ResponseBody
    public Greeting dotest2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(1, "hello，" + name);
    }
}
