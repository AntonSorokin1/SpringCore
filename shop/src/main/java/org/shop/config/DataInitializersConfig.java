package org.shop.config;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializersConfig {
    @Bean
    public ProductInitializer createProductInitializer(ApplicationContext context) {
        return new ProductInitializer(context.getBean(ProductService.class));
    }

    @Bean
    public ProposalInitializer createProposalInitializer() {
        return new ProposalInitializer();
    }

    @Bean
    public SellerInitializer createSellerInitializer(ApplicationContext context) {
        return new SellerInitializer(context.getBean(SellerService.class));
    }

    @Bean
    public UserInitializer createUserInitializer(ApplicationContext context) {
        return new UserInitializer(context.getBean(UserService.class));
    }

    @Bean
    public DataInitializer createDataInitializer(ApplicationContext context) {
        return new DataInitializer(
                createSellerInitializer(context),
                createProductInitializer(context),
                createProposalInitializer(),
                createUserInitializer(context)
        );
    }
}
