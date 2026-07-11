package com.example.homebaker.Repository;
import com.example.homebaker.Modular.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBakerId(Long bakerId);
    List<Product> findByIsEgglessTrue();
    List<Product> findByIsGlutenFreeTrue();
    List<Product> findByIsVeganTrue();
    List<Product> findByCategory(String category);
    List<Product> findByOccasion(String occasion);
}
