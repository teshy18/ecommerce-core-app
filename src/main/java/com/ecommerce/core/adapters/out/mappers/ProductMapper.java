package com.ecommerce.core.adapters.out.mappers;

import org.mapstruct.Mapper;

import com.ecommerce.core.adapters.in.rest.dto.request.ProductRequestDto;
import com.ecommerce.core.adapters.in.rest.dto.response.ProductResponseDto;
import com.ecommerce.core.domain.model.Product;
import com.ecommerce.core.infrastructure.persistence.dbo.ProductDbo;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    Product toDomain(ProductRequestDto dto);

    ProductResponseDto toResponseDto(Product product);

    ProductDbo toDbo(Product product);

    Product toDomain(ProductDbo dbo);

}
