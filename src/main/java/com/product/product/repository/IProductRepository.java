package com.product.product.repository;

import com.product.product.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface IProductRepository extends ElasticsearchRepository<Product,Long> {
    Optional<Product> findById(Long id);
}
