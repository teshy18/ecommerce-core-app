package com.ecommerce.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id; 
    private String username; 
    private String email; 
    private String password; 
    private String roles;  

}
