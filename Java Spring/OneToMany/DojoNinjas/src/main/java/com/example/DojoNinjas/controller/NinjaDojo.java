package com.example.DojoNinjas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DojoNinjas.models.Dojo;
import com.example.DojoNinjas.models.Ninja;
import com.example.DojoNinjas.services.DojoServ;
import com.example.DojoNinjas.services.NinjaServ;

import jakarta.validation.Valid;

@Controller
public class NinjaDojo {
	@Autowired
	DojoServ dojoServ;
	
	@Autowired
	NinjaServ ninjaServ;
	
	@RequestMapping("/ninja")
	
	    public String newNinja(Model model) {
	        model.addAttribute("ninja", new Ninja());
	        model.addAttribute("dojos", dojoServ.allDojos());
	        return "ninja.jsp";
	    
	}
	
	@RequestMapping("/dojo")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
	    return "dojo.jsp";
	}
	
	@RequestMapping("/ffff/{id}")
	public String index(Model model,@PathVariable("id") Long dojoId) {
		
		 Dojo dojo = dojoServ.findDojo(dojoId);
		    
		    List<Ninja> ninjas = ninjaServ.findNinjaByDojo(dojo);  // Example method to find ninjas by dojo
		    
		    model.addAttribute("dojo", dojo);
		    model.addAttribute("ninjas", ninjas);
	    return "NewFile.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
		BindingResult result, 
		Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojo", dojo);
			return "dojo.jsp";
		} else {
			dojoServ.createDojo(dojo);
			return "redirect:/dojo" ;
		}
	}
	 
	@PostMapping("ninjas/new")
	public String addNinja(
	    @Valid @ModelAttribute("ninja") Ninja ninja,
	    BindingResult result, 
	    Model model) {
	    if (result.hasErrors()) {
	        return "ninja.jsp";
	    } else {
	        ninjaServ.createNinja(ninja);
	        return "redirect:/ffff";
	    }
	}
}
