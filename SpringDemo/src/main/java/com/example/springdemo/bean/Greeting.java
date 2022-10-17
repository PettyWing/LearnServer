package com.example.springdemo.bean;

import com.example.springdemo.controller.TestController;

public class Greeting{
    int id;
    String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Greeting setId(int id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Greeting setContent(String content) {
        this.content = content;
        return this;
    }
}
