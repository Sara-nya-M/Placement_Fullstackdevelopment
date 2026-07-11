package com.example.Amazonclone.Controller;


import com.example.Amazonclone.Model.CartItem;
import com.example.Amazonclone.Repository.CartRepository;
import com.example.Amazonclone.Repository.UserRepository;
import com.example.Amazonclone.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:3000/")
public class CartController {

    @Autowired
    private CartRepository repo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    @PostMapping
    public CartItem saveCartItem(@RequestBody CartItem item) {
        return repo.save(item);
    }

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return repo.findAll();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getCartByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(repo.findByUserId(userId));
    }

    @PostMapping("/add")
    public ResponseEntity<?> addToCart(@RequestBody Map<String, Object> payload) {
        if (!payload.containsKey("userId") || !payload.containsKey("productId")) {
            return ResponseEntity.badRequest().body(Map.of("message", "userId and productId are required"));
        }

        try {
            Long userId = Long.valueOf(payload.get("userId").toString());
            Long productId = Long.valueOf(payload.get("productId").toString());
            int quantity = payload.containsKey("quantity") ? Integer.parseInt(payload.get("quantity").toString()) : 1;

            var userOpt = userRepo.findById(userId);
            var productOpt = productRepo.findById(productId);

            if (userOpt.isEmpty()) {
                return ResponseEntity.status(404).body(Map.of("message", "User not found"));
            }
            if (productOpt.isEmpty()) {
                return ResponseEntity.status(404).body(Map.of("message", "Product not found"));
            }

            Optional<CartItem> existingItemOpt = repo.findByUserIdAndProductId(userId, productId);
            CartItem cartItem;
            if (existingItemOpt.isPresent()) {
                cartItem = existingItemOpt.get();
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            } else {
                cartItem = new CartItem();
                cartItem.setUser(userOpt.get());
                cartItem.setProduct(productOpt.get());
                cartItem.setQuantity(quantity);
            }

            return ResponseEntity.ok(repo.save(cartItem));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(Map.of("message", "Invalid format for userId, productId or quantity"));
        }
    }

    @DeleteMapping("/{cartItemId}")
    public ResponseEntity<?> removeCartItem(@PathVariable Long cartItemId) {
        if (!repo.existsById(cartItemId)) {
            return ResponseEntity.status(404).body(Map.of("message", "Cart item not found"));
        }
        repo.deleteById(cartItemId);
        return ResponseEntity.ok(Map.of("message", "Item removed from cart"));
    }

    @DeleteMapping("/user/{userId}/product/{productId}")
    public ResponseEntity<?> removeProductFromCart(@PathVariable Long userId, @PathVariable Long productId) {
        Optional<CartItem> itemOpt = repo.findByUserIdAndProductId(userId, productId);
        if (itemOpt.isEmpty()) {
            return ResponseEntity.status(404).body(Map.of("message", "Product not found in user's cart"));
        }
        repo.delete(itemOpt.get());
        return ResponseEntity.ok(Map.of("message", "Product removed from cart"));
    }
}

