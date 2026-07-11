package com.example.homebaker.Repository;
import com.example.homebaker.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(Long customerId);
    List<Order> findByBakerId(Long bakerId);
    List<Order> findByBakerIdAndStatus(Long bakerId, String status);
    List<Order> findByCustomerIdAndBakerId(Long customerId, Long bakerId);
}
