package com.sk.skala.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.skala.myapp.domain.Product;
import com.sk.skala.myapp.domain.ProductStatus;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByStatus(ProductStatus status);

    List<Product> findByUserId(Long userId);

    List<Product> findByUserName(String userName);
}
