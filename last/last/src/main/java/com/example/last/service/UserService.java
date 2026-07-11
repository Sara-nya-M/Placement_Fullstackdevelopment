package com.example.last.service;


import com.example.last.dto.UserDTO;
import com.example.last.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<UserDTO> getAllUsers() {

        return repo.findAll()
                .stream()
                .map(u -> new UserDTO(u.getName(), u.getEmail()))
                .collect(Collectors.toList());

    }
}
