package com.ecommerce.core.domain.port.out;

import java.util.List;

import com.ecommerce.core.domain.model.Product;

public interface ProductRepository {

    Product save(Product product);

    List<Product> findAll();

}
