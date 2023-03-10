package com.epam.customconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epam.customconfig.config")
public class SpringCustomConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomConfigurationApplication.class, args);
    }

}
