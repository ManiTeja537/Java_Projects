package com.project1.myProject.service;

import org.springframework.stereotype.Service;

@Service
public class DataService {
    private String status = "success";
    public String getStringData(){
        return status;
    }
}
