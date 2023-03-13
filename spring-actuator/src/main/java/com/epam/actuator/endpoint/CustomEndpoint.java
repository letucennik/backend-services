package com.epam.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {

    @ReadOperation
    @Bean
    public String sendResponse() {
        return "Custom endpoint response";
    }

}