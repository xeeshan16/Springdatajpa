package com.zeeshan.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.zeeshan.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
