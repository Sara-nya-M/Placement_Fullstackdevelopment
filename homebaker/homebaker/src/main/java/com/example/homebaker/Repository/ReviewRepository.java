package com.example.homebaker.Repository;

import com.example.homebaker.Modular.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBakerId(Long bakerId);
    List<Review> findByCustomerId(Long customerId);
}
