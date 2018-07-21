package com.heller.acme;

// 2. 创建服务类
public class DataSourceService {

    private DataSource dataSource;

    public DataSourceService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDriver() {
        return dataSource.getDriver();
    }

    public String getUrl() {
        return dataSource.getUrl();
    }

    public String getUsername() {
        return dataSource.getUsername();
    }

    public String getPassword() {
        return dataSource.getPassword();
    }

    public String getAddress() {
        return dataSource.getAddress();
    }

}
