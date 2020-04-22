package org.shop.config;

import org.shop.data.SomeClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyClassConfig {
    @Bean
    public SomeClass createSomeClass() {
        return new SomeClass();
    }
}
