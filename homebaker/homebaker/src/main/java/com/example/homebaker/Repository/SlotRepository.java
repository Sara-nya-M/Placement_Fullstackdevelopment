package com.example.homebaker.Repository;

import com.example.homebaker.Modular.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    Slot findByBakerIdAndDate(Long bakerId, String date);
    List<Slot> findByBakerId(Long bakerId);
}