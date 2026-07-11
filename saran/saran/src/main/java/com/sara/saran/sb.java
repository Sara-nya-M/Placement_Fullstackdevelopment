package com.sara.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sb {
    @GetMapping("/calculator/{a}/{b}")
    public String cal(@PathVariable int a , @PathVariable int b){
        StringBuilder sb = new StringBuilder();
        sb.append("Addition of two numbers : ").append(a+b).append("\n");
        sb.append("Difference between two numbers : ").append(a-b).append("\n");
        sb.append("Product of two numbers : ").append(a*b).append("\n");
        if(b!=0){
            sb.append("Quiotent of two numbers : ").append(a/b).append("\n");
            sb.append("Remainder of two numbers : ").append(a%b).append("\n");
        }
        else{
            sb.append("Divisible by zero is not allowed");
        }
        return "<pre>" + sb.toString() + "</pre>";


    }
}
