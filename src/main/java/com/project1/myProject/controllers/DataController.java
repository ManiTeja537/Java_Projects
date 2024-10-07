package com.project1.myProject.controllers;

import com.project1.myProject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;
    @GetMapping("/data")
    public String getData(){
        return dataService.getStringData();
    }
}
