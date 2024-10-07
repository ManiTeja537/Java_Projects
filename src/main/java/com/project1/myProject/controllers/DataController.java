package com.project1.myProject.controllers;

import com.project1.myProject.model.Product;
import com.project1.myProject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;
    @GetMapping("/data")
    public Product getData(@RequestHeader String id,
                           @RequestHeader String name,
                           @RequestHeader String qty){
        return dataService.getStringData(id,name,qty);
    }
}
