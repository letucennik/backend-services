package com.epam.profiles.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Profile("dev")
public class DevDataSourceConfig {
    @Value("${spring.datasource.dev.url}")
    private String url;

    @Value("${spring.datasource.dev.username}")
    private String username;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(url)
                .username(username)
                .build();
    }
}