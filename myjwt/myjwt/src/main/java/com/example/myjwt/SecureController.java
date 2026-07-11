package com.example.myjwt;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureController {

    @GetMapping("/secure-data")
    public String secureData() {
        return "This is protected content!";
    }

    @GetMapping("/hello")
    public String sData() {
        return "Hiiiiiiiiiiiiiiiiiii.....";
    }
}