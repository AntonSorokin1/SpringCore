package org.shop.config;

import org.shop.processors.InjectRandomIntAnnotationProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationProcessorsConfig {
    @Bean
    public InjectRandomIntAnnotationProcessor createInjectRandomIntAnnotationProcessor() {
        return new InjectRandomIntAnnotationProcessor();
    }
}
