package com.heller.acme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 3. 创建自动配置类
@Configuration
@EnableConfigurationProperties(DataSource.class)
@ConditionalOnClass(DataSourceService.class)
@ConditionalOnProperty(prefix = "datasource", value = "enabled", matchIfMissing = true)
public class DataSourceAutoConfiguration {

    @Autowired
    private DataSource dataSource;

    @Bean
    @ConditionalOnMissingBean(DataSourceService.class)
    public DataSourceService dataSourceService() {
        DataSourceService dataSourceService = new DataSourceService(dataSource);
        return dataSourceService;
    }

}
