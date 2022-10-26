package com.example.springdemo.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // 这个名字也不是随便取的，上面编写test.xsd的根节点元素的name， <xsd:element name="application">
        // 将一个 XML 节点解析成 IOC 容器中的一个实体类。也就是说相当于在xml里面的配置的对象，通过Spring ioc 容器管理起来了
        registerBeanDefinitionParser("application", new MyBeanDefinitionParser());
    }
}
