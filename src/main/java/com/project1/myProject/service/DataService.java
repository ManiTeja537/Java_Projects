package com.project1.myProject.service;

import com.project1.myProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private Product product;
    public Product getStringData(String id,String name,String qty){
        product.setId(id);
        product.setName(name);
        product.setQuantity(qty);
        return product;
    }
}
