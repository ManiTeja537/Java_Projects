package com.project1.myProject.service;

import com.project1.myProject.model.Product;
import com.project1.myProject.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product newProductCreation(Product product){
        return productRepository.save(product);
    }
    public List<Product> getProductList(){
        return productRepository.findAll();
    }
}
