package org.shop.config;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.shop.repository.ItemRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.shop.repository.SellerRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {
    @Bean
    public OrderService createOrderService() {
        return new OrderServiceImpl();
    }

    @Bean
    public ItemService createItemService(ApplicationContext context) {
        return new ItemServiceImpl(context.getBean(ItemRepository.class));
    }

    @Bean
    public ProductService createProductService(ApplicationContext context) {
        return new ProductServiceImpl(context.getBean(ProductRepository.class));
    }

    @Bean
    public ProposalService createProposalService(ApplicationContext context) {
        return new ProposalServiceImpl(context.getBean(ProposalRepository.class));
    }

    @Bean
    public SellerService createSellerService(ApplicationContext context) {
        return new SellerServiceImpl(context.getBean(SellerRepository.class));
    }

    @Bean
    public UserService createUserService(ApplicationContext context) {
        return new UserServiceImpl(context.getBean(UserRepositoryFactory.class).createUserRepository());
    }
}
