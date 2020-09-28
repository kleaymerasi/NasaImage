package com.base.example.restTempConfig;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages ={"com.base.example"})
public class RestTempConfig {

    @Bean
    public RestTemplateBuilder builder() {
        return new RestTemplateBuilder();
    }

    @Bean
    public RestTemplate restTemplate() {
      return builder().build();
    }
}
