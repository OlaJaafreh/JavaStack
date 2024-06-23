package com.example.DaikichiPathVariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@RequestMapping("/daikichi")
public class DaikichiPathVariables {
    @RequestMapping("/travel/{city}")
    public String travel( @PathVariable("city") String city){
    	return "Congratulations! You will soon travel to "+ city;
    }
    
    
    @RequestMapping("/lotto/{amount}")
    public String lotto(@PathVariable("amount") int amount){
    	if(amount%2==0) {
    	return "You will take a grand journey in the near future, but be weary of tempting offers";}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
    
}
