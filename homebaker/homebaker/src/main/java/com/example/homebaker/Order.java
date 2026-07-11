package com.example.homebaker;
import com.example.homebaker.Modular.Product;
import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;
@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "baker_id")
    private User baker;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String cakeShape;
    private String cakeSize;
    private String cakeFlavor;
    private String cakeTopping;
    private String cakeMessage;

    private Double finalPrice;
    private Integer quantity;
    private String deliveryTimeSlot;
    private String deliveryDate;
    private String deliveryType;

    private String status = "PENDING";


    private String orderDate;
}
