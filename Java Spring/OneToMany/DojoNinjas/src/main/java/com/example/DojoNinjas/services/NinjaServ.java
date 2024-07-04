package com.example.DojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DojoNinjas.models.Dojo;
import com.example.DojoNinjas.models.Ninja;
import com.example.DojoNinjas.repositiries.NinjaRepo;

@Service
public class NinjaServ {
	
	@Autowired
	NinjaRepo ninjaRepo;
	
	 public List<Ninja> allBooks() {
	        return ninjaRepo.findAll();
	    }
	    // creates a book
	    public Ninja createNinja(Ninja b) {
	        return ninjaRepo.save(b);
	    }
	    // retrieves a book
	    public Ninja findNinja(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public List<Ninja> findNinjaByDojo(Dojo dojo) {
	    	List<Ninja> optionalNinja = ninjaRepo.findByDojo(dojo);
	        
	            return optionalNinja;
	        
	    }
	
	
	
	
    
}
