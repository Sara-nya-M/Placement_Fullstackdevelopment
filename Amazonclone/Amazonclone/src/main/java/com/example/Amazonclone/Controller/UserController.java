package com.example.Amazonclone.Controller;


import com.example.Amazonclone.Repository.UserRepository;
import com.example.Amazonclone.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email is required"));
        }
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Password is required"));
        }
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email is already registered"));
        }
        User savedUser = repo.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email and password are required"));
        }

        Optional<User> userOpt = repo.findByEmail(email);
        if (userOpt.isEmpty() || !userOpt.get().getPassword().equals(password)) {
            return ResponseEntity.status(401).body(Map.of("message", "Invalid email or password"));
        }

        return ResponseEntity.ok(userOpt.get());
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
