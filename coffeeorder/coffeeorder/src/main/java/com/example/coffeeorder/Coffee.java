package com.example.coffeeorder;

public class Coffee {
    private int id;
    private String name;
    private String coffeetype;

    public Coffee(int id, String name, String coffeetype) {
        this.id = id;
        this.name = name;
        this.coffeetype = coffeetype;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCoffeetype() {
        return coffeetype;
    }

}
