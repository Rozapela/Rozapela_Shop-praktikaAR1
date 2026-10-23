package com.github.rozapela.shop.repository;

import com.github.rozapela.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}