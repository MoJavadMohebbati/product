package com.product.product.service.impl;

import com.product.product.model.Product;
import com.product.product.repository.IProductRepository;
import com.product.product.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository iProductRepository;
    @Override
    public Long save(Product product) {
        return iProductRepository.save(product).getId();
    }

    @Override
    public Optional<Product> loadById(Long id) {
        return iProductRepository.findById(id);
    }
}
