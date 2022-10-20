package com.example.springdemo.service;

import com.example.springdemo.bean.XmlRootTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
public class TestService implements ApplicationContextAware{
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
