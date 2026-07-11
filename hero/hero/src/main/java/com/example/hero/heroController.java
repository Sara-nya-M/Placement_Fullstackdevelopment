package com.example.hero;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class heroController {

    private List<Hero> heroes = new ArrayList<>();

    @GetMapping
    public List<Hero> getHeroes(){
        return heroes;
    }
    

    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        heroes.add(hero);
        return hero;
    }


}