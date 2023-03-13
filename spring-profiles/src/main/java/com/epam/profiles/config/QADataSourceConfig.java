package com.epam.profiles.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Profile("qa")
public class QADataSourceConfig {
    @Value("${spring.datasource.qa.url}")
    private String url;

    @Value("${spring.datasource.qa.username}")
    private String username;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(url)
                .username(username)
                .build();
    }
}
