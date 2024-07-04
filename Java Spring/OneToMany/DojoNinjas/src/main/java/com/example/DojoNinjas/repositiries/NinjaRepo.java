package com.example.DojoNinjas.repositiries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoNinjas.models.Dojo;
import com.example.DojoNinjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	
	
	 List<Ninja> findAll();
	 List<Ninja> findByDojo(Dojo dojo);
	
}
