package com.example.homebaker.Modular;


import jakarta.persistence.*;
import lombok.Data;
import com.example.homebaker.Modular.User;
// THIS import should be YOUR User, not apache//


@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private com.example.homebaker.User customer; // ← use full path

    @ManyToOne
    @JoinColumn(name = "baker_id")
    private com.example.homebaker.User baker; // ← use full path

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
}}