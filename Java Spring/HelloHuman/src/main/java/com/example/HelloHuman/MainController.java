package com.example.HelloHuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
//	@RequestMapping("")
//    public String index() {
//        return "Hello Human";
//    }
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value = "name", required = false, defaultValue = "Human") String name) {
//        return "Hello: " + name;
//    }
//	
//	 @RequestMapping("/")
//	    public String index2(@RequestParam(value = "name", required = false, defaultValue = "Human") String name,
//	    		@RequestParam(value = "last", required = false, defaultValue = "Human") String last){
//	    	return "Hello: " + name + " "  + last;
//	    }
//	 
	 @RequestMapping("/")
	    public String index3(
	        @RequestParam(value = "name", required = false) String name,
	        @RequestParam(value = "times", required = false ,defaultValue = "0") int times,
	        @RequestParam(value = "last", required = false,defaultValue = "kmf") String last) {
		 if(name == null && times == 0 && last==null) {
			 return "Hello Human"; 
		 }
		 else if(name != null && times == 0 && last==null) {
			 return "Hello: " + name;
		 }
		 else if(name != null && times == 0 && last != null) {
			 return "Hello: " + name + " "  + last;
			 
		 }
		 else {
	        StringBuilder myString = new StringBuilder();
	        for (int i = 0; i < times; i++) {
	            myString.append("Hello: ").append(name).append(" ");
	        }
	        return myString.toString();
	    }
	 }
}

