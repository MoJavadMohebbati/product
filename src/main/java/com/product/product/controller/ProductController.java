package com.product.product.controller;

import com.product.product.model.Product;
import com.product.product.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = "application/json;charset=UTF-8")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @PostMapping(value = "/save")
    public Long save(@RequestBody Product product) {
        return iProductService.save(product);
    }

    @GetMapping(value = "/load/{id}")
    public Optional<Product> loadById(@PathVariable Long id) {
        return iProductService.loadById(id);
    }
}
