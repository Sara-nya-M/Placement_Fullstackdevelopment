package com.sara.saran;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cont {
    @GetMapping("/urhtml")

    public String sayHello(){
        return "<h1>Hi this is MS Dhoni....! " +
                "I m from CSK Team </h1>" +
                "<h2> How are you....?</h2>" +
                "<img src = 'https://tinyurl.com/yfm567j3' >" +
                "<img src =  'image1.jpg'/>" +
                "<img src =   'image3.jpg' /> " ;



    }
}
