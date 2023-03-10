package com.epam.autoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epam.autoconfig.config")
public class SpringAutoConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAutoConfigurationApplication.class, args);
    }

}
