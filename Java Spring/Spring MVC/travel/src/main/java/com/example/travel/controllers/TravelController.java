package com.example.travel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.travel.models.Travel;
import com.example.travel.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	TravelService travelService;
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expenes")Travel travel,Model model) {
		model.addAttribute("expenses",travelService.allTravel());
		return "Index.jsp";
		}
	
	
	@PostMapping("/expensesNew")
    public String create(@Valid @ModelAttribute("newTravel") Travel travel, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {

        	 redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
             return "redirect:/expenses";
  		  

        } else {
        	travelService.createTravel(travel);
            return "redirect:/expenses";
        }
    }
	
	 @GetMapping("/expenses/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Travel travel = travelService.findTravel(id);
	        model.addAttribute("expensesEdit", travel);
	        return "EditFront.jsp";
	    }
	 
	 @GetMapping("/expenses/det/{id}")
	    public String show(@PathVariable("id") Long id, Model model) {
	        Travel travel = travelService.findTravel(id);
	        model.addAttribute("expensesDet", travel);
	        return "detFront.jsp";
	    }
	 
	 
	    
	    @PutMapping("/edit/{id}")
	    public String update(@Valid @ModelAttribute("expensesEdit") Travel travel, BindingResult result, Model model) {
	        if (result.hasErrors()) {
//	            model.addAttribute("expensesEdit", travel);
	            return "EditFront.jsp";
	        } else {
	        	travelService.updateTravel(travel);
	            return "redirect:/expenses";
	        }
	    }
	    
	    
	    @DeleteMapping("/del/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	    	travelService.deleteTravel(id);
	        return "redirect:/expenses";
	    }
	
	

}
