package com.ecommerce.core.adapters.in.rest.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {
    @NotBlank
    private String name; 

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal price;
    
    private String description;

    @NotNull
    private Integer stock; 
}
