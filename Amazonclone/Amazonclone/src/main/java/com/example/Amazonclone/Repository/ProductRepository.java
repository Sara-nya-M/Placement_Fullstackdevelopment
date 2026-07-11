package com.example.Amazonclone.Repository;

import com.example.Amazonclone.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
