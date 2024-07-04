package com.example.DojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DojoNinjas.models.Dojo;
import com.example.DojoNinjas.repositiries.DojoRepo;
import com.example.DojoNinjas.repositiries.NinjaRepo;

@Service
public class DojoServ {
	
	@Autowired
	DojoRepo dojoRepo;
	
	 public List<Dojo> allDojos() {
	        return dojoRepo.findAll();
	    }
	    // creates a book
	    public Dojo createDojo(Dojo b) {
	        return dojoRepo.save(b);
	    }
	    // retrieves a book
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
	
   

}
