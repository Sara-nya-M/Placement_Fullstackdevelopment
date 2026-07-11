package com.sara.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.awt.Color.white;

@RestController
public class csss {
    @GetMapping("/css")
    public String css(){
        return "<h1 style='color:red;'>Hello Saranya</h1>" +
                "<p style='color:pink;'> I m a girl </p>";

    }
}
