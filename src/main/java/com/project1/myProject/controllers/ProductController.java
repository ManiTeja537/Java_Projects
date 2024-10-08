package com.project1.myProject.controllers;

import com.project1.myProject.model.Product;
import com.project1.myProject.repo.ProductRepository;
import com.project1.myProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.newProductCreation(product);
    }

    @GetMapping("/allProds")
    public List<Product> getAllProducts(){
        return productService.getProductList();
    }
}
