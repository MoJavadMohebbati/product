package com.product.product.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Getter
@Setter
//@Document(indexName = "#{@environment.getProperty('ELASTIC_PRODUCT')}-#{@elasticIndexNameGenerator.calculateSuffix()}")
public class Product {
    @Id
    private Long id;
    private String title;
    private String description;

}
