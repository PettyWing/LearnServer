package com.example.springdemo.schema;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class MyBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Test.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        // this however is an optional property
        String website = element.getAttribute("website");
        if (StringUtils.hasText(website)) {
            bean.addPropertyValue("website", website);
        }
        String weiXin = element.getAttribute("weixin");
        if (StringUtils.hasText(weiXin)) {
            bean.addPropertyValue("weixin", weiXin);
        }
    }
}
