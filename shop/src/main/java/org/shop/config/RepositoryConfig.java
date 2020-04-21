package org.shop.config;

import org.shop.repository.*;
import org.shop.repository.map.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {
    @Bean
    public ItemRepository createItemMapRepository() {
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository createOrderMapRepository() {
        return new OrderMapRepository();
    }

    @Bean
    public ProductRepository createProductMapRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository createProposalMapRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository createSellerMapRepository() {
        return new SellerMapRepository();
    }
}
