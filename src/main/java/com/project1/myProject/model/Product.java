package com.project1.myProject.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private String quantity;
}
