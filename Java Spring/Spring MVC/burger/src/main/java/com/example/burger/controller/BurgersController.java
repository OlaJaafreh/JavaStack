package com.example.burger.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.burger.model.Burger;
import com.example.burger.service.BurgerService;


import jakarta.validation.Valid;
@Controller
public class BurgersController {

    private final BurgerService burgerService;
    
    public BurgersController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }
    
    @RequestMapping("/burgers")
    public String index(@ModelAttribute("newBurger")Burger newBurger, Model model) {
		
		  List<Burger> burgers = burgerService.allBurger();
		  model.addAttribute("burger", burgers);
//		  model.addAttribute("newBurger", new Burger());
        return "index.jsp";
    }
    
    @RequestMapping("/burgers/{id}")
    public String index2(Model model,@PathVariable("id") Long id) {
		
		  Burger burger = burgerService.findBurger(id);
		  model.addAttribute("editBurger", burger);
        return "index2.jsp";
    }
    
    @RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("editBurger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {

            return "index2.jsp";
        } else {
        	burgerService.editBurger(burger);
            return "redirect:/burgers";
        }
    }

    
    

    @PostMapping("/burgerss")
    public String create(@Valid @ModelAttribute("newBurger") Burger burger, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {

        	 redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
             return "redirect:/burgers";
  		  
//   		return "redirect:/burgers";
        } else {
        	burgerService.createBurger(burger);
            return "redirect:/burgers";
        }
    }
    

    

    
}