package com.example.travel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.travel.models.Travel;
import com.example.travel.repositories.TravelRepo;



@Service
public class TravelService {
	
	private final TravelRepo travelRepo;
    
    public TravelService(TravelRepo travelRepo) {
        this.travelRepo = travelRepo;
    }
    
    
    // returns all the Travel
    public List<Travel> allTravel() {
        return travelRepo.findAll();
    }
    // creates a Travel
    public Travel createTravel(Travel b) {
        return travelRepo.save(b);
    }
    
    public void deleteTravel(Long id) {
    	travelRepo.deleteById(id);
    }
    
    public Travel updateTravel(Travel b) {
        return travelRepo.save(b);
    }
    // retrieves a Travel
    public Travel findTravel(Long id) {
        Optional<Travel> optionalTravel = travelRepo.findById(id);
        if(optionalTravel.isPresent()) {
            return optionalTravel.get();
        } else {
            return null;
        }
    }

}
