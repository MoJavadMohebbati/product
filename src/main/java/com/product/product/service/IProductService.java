package com.product.product.service;

import com.product.product.model.Product;

import java.util.Optional;

public interface IProductService {

    Long save(Product product);

    Optional<Product> loadById(Long id);

}
