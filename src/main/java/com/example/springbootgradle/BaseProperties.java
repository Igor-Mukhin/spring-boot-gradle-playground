package com.example.springbootgradle;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "base")
@Getter
@Setter
public class BaseProperties {

    private String baseProp;

}
