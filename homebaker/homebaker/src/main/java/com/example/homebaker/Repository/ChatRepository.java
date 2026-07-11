package com.example.homebaker.Repository;

import com.example.homebaker.Modular.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findByOrderId(Long orderId);
    List<Chat> findBySenderIdAndReceiverId(Long senderId, Long receiverId);
}
