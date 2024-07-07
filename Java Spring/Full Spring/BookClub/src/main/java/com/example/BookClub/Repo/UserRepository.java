package com.example.BookClub.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BookClub.Models.Books;
import com.example.BookClub.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    
}
