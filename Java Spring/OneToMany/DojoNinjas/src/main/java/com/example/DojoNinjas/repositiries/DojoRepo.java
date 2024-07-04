package com.example.DojoNinjas.repositiries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoNinjas.models.Dojo;
import com.example.DojoNinjas.models.Ninja;

@Repository
public interface DojoRepo extends CrudRepository<Dojo,Long> {
	
	 List<Dojo> findAll();
	
	    
	    

}
