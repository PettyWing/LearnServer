package com.example.springdemo.schema;

public class Test {
    private String weixin;

    private String website;

    // 必须要有一个空的构造函数

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Test{" +
            "weixin='" + weixin + '\'' +
            ", website='" + website + '\'' +
            '}';
    }
}
