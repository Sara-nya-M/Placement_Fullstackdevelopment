package com.sara.saran;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class html {
    @GetMapping("/myhtml")

    public String sayHello(){
        return "<h1>Hi this is saranya " +
                "I m from AI&DS Department</h1" +
                "<h2> How are you</h2>" ;


    }
}
