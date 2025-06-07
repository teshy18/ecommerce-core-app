package com.ecommerce.core.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.core.domain.model.Product;
import com.ecommerce.core.domain.port.in.ProductService;
import com.ecommerce.core.domain.port.out.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final  ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {
    
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

}
