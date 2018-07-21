package com.heller.acme;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 1. 首先定义我们的配置类，定义好前缀和各个配置项
@ConfigurationProperties(prefix = "datasource")
public class DataSource {

    /**
     * 数据库使用的驱动，完整类
     */
    private String driver;

    /**
     * 数据库连接url
     */
    private String url;

    /**
     * 数据库连接用户名
     */
    private String username;

    /**
     * 数据库连接密码
     */
    private String password;

    /**
     * 数据库地址
     */
    private String address;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
