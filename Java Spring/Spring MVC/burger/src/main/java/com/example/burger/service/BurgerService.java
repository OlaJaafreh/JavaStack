package com.example.burger.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.burger.model.Burger;
import com.example.burger.repositories.BurgerRepository;

@Service
	public class BurgerService {
	    // adding the Burger repository as a dependency
	    private final BurgerRepository burgerRepository;
	    
	    public BurgerService(BurgerRepository burgerRepository) {
	        this.burgerRepository = burgerRepository;
	    }
	    
	    
	    // returns all the Burgers
	    public List<Burger> allBurger() {
	        return burgerRepository.findAll();
	    }
	    // creates a Burger
	    public Burger createBurger(Burger b) {
	        return burgerRepository.save(b);
	    }
	    
	    public Burger editBurger(Burger b) {
	        return burgerRepository.save(b);
	    }
	    

	    
	    // retrieves a Burger
	    public Burger findBurger(Long id) {
	        Optional<Burger> optionalBurger = burgerRepository.findById(id);
	        if(optionalBurger.isPresent()) {
	            return optionalBurger.get();
	        } else {
	            return null;
	        }
	    }
	    

	}
