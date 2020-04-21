package org.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RepositoryConfig.class, ServicesConfig.class, FactoryConfig.class, DataInitializersConfig.class})
public class MainConfig {

}
