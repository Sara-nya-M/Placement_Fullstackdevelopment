package com.example.Amazonclone.Controller;

import com.example.Amazonclone.Model.Product;
import com.example.Amazonclone.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repo.save(product);
    }
}