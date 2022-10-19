package com.example.springdemo.service;

import com.example.springdemo.bean.XmlRootTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    ApplicationContext applicationContext;
    XmlRootTest xmlRootTest;

    public TestService() {
        System.out.println("");
    }

    public XmlRootTest getXmlRootTest() {
        return xmlRootTest;
    }

    public void setXmlRootTest(XmlRootTest xmlRootTest) {
        this.xmlRootTest = xmlRootTest;
    }
}
