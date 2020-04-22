package org.shop.config;

import org.shop.aspects.RepositoryAspect;
import org.shop.aspects.ServicesAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectsConfig {
    @Bean
    public RepositoryAspect createRepositoryAspect() {
        return new RepositoryAspect();
    }

    @Bean
    public ServicesAspect createServicesAspect() {
        return new ServicesAspect();
    }
}
