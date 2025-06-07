package com.ecommerce.core.domain.port.in;

import java.util.List;

import com.ecommerce.core.domain.model.Product;


public interface ProductService {

    void createProduct(Product product);

    List<Product> getAllProducts();

}
