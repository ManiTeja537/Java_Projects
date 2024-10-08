package com.project1.myProject.config;

import com.project1.myProject.model.Product;
import com.project1.myProject.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public ProductService getProductService(){
        return new ProductService();
    }
    @Bean
    public Product getProduct(){
        return new Product();
    }
}
