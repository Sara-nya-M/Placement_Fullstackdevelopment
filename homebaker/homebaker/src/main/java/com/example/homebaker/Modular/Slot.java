package com.example.homebaker.Modular;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "slots")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "baker_id")
    private User baker;

    private String date;
    private Integer totalSlots;
    private Integer filledSlots = 0;
}
