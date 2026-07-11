package com.sara.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class string {
    @GetMapping("intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name , @PathVariable String city ,@PathVariable String course  ){
        return "Hello , I am "+ name + ", from "+ city + ", welcome to "+ course;

    }
}
