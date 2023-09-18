package com.example.springbootgradle;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "sub")
@Getter
@Setter
public class SubProperties extends BaseProperties {

    private String subProp;

}
