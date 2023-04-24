package com.example.configuration;
//create a auto configuration to setup a default rest template
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
@Configuration
@Slf4j
public class RestTemplateConfiguration {
    //create a default rest template
    @Bean
    @ConditionalOnMissingBean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        log.info("create a default rest template");
        //set both  read and connection timeout to max value for the rest template
        builder.setReadTimeout(1000000);
        builder.setConnectTimeout(1000000);
        return builder.build();
    }
}
// public class RestTemplateConfiguration {
    
// }
