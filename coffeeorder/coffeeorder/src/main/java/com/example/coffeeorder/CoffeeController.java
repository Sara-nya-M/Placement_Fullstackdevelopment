package com.example.coffeeorder;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service){
        this.service=service;
    }
    @PostMapping("/{name}/{coffeeType}")
    public Coffee orderCoffee(@PathVariable String name , @PathVariable String coffeeType){
        return service.orderCoffee(name,coffeeType);
    }
    @GetMapping
    public List<Coffee> getOrders(){
        return service.getOrders();
    }
}
