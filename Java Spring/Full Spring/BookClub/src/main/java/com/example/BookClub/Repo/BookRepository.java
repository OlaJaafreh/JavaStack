package com.example.BookClub.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BookClub.Models.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Long> {
    
    Optional<Books> findById(Long id);
    List<Books> findAll();
    void deleteById(Long id);
    

}
