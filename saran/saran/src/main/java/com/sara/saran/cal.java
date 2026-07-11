package com.sara.saran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class cal {
    @GetMapping("/addition/{num1}/{num2}")
    public String sum(@PathVariable int num1 , @PathVariable int num2){
        int ans = num1+num2;
        return "Addition of " + num1 + " and " + num2 + " is " + ans;
    }
    @GetMapping("/difference/{numa}/{numb}")
    public String difference(@PathVariable int numa , @PathVariable int numb){
        int dif = numa-numb;
        return "Differnece  of " + numa + " and " + numb + " is " + dif;
    }
    @GetMapping("/product/{numa}/{numb}")
    public int multiple(@PathVariable int numa , @PathVariable int numb){
        int pro = numa*numb;
        return pro;
    }
    @GetMapping("/quiotent/{num1}/{num2}")
    public int div(@PathVariable int num1 , @PathVariable int num2) {
        int div = num1/num2;
        return div;
    }
    @GetMapping("odd/{a}/{b}")
    public String sov(@PathVariable int a , @PathVariable int b){
        int res = a + b ;
        if(res%2 == 0){
            return "Sum:even";
        }

        return "Sum : odd";
    }
    @GetMapping("name/{Name}")
    public String nname(@PathVariable String Name){

        if(Name.equalsIgnoreCase("Saranya")){
            return "Yahh ! It's me";
        }
        return "Who is this";

    }
    @GetMapping("/climate/{value}")
    public String cc(@PathVariable int value){
        if(value<0){
            return "Shivering";
        }
        else if(value>0 && value < 15){
            return "Chill";
        }
        else if(value>= 15 && value <=24){
            return "Happy";
        }
        else if(value>= 24 && value < 30){
            return "Towards Hot";
        }
        else if(value >= 30 && value < 32){
            return "HOTTER";
        }
        else{
            return "OMG";
        }
    }

}
