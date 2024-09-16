package com.product.productMicroserviceService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.productMicroserviceService.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
