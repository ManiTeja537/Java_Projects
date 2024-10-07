package com.project1.myProject.beans;

import com.project1.myProject.model.Product;
import com.project1.myProject.service.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreation {
    @Bean
    public DataService getDataService(){
        return new DataService();
    }
    @Bean
    public Product getProduct(){
        return new Product();
    }
}
