package com.example.smart_olam.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "custom.swagger")
public class SwaggerProperties {

    private String title = "API";
    private String description = "API Documentation";
    private String version = "1.0.0";
    private boolean enabled = true;

    // getters & setters
}

