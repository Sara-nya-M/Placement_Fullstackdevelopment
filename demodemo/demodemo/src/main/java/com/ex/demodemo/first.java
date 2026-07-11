package com.ex.demodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class first {
    @GetMapping("H1")
    public String sayHello(){
        return "HELOOOOOOOO";
    }
    @GetMapping("Name")
    public String name(){
        return "Saranya";
    }
    @GetMapping("Address")
    public String address(){
        return "Coimbatore";
    }


}
