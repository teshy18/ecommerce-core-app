package com.ecommerce.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id; 
    private String name; 
    private String description; 
    private Double price; 
    private int stock; 
    private String imageUrl; 
    private boolean isActive; 

}
