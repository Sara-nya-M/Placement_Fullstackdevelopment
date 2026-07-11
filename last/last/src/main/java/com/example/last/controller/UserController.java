package com.example.last.controller;

import com.example.last.dto.UserDTO;
import com.example.last.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return service.getAllUsers();
    }
}
