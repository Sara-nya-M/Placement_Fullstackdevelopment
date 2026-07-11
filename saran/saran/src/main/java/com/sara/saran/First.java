package com.sara.saran;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class First {
    @GetMapping("/hello/{name}")
    public String string (@PathVariable String name){
        return "Hi, Its's me 💕" + name;
    }





}
