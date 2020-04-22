package org.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@Import({
        RepositoryConfig.class,
        ServicesConfig.class,
        FactoryConfig.class,
        DataInitializersConfig.class,
        AspectsConfig.class,
        MyClassConfig.class,
        AnnotationProcessorsConfig.class,
        })
public class MainConfig {

}
