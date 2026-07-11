package com.example.coffeeorder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CoffeeService {
    private List<Coffee> orders = new ArrayList<>();
    private int id=1;
    public Coffee orderCoffee(String name,String coffeeType){
        Coffee coffee = new Coffee(id++,name,coffeeType);
        orders.add(coffee);
        return coffee;
    }
    public List<Coffee> getOrders(){
        return orders;
    }
}
