package com.example.BookClub.Serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookClub.Models.Books;
import com.example.BookClub.Models.User;
import com.example.BookClub.Repo.BookRepository;

@Service
public class BookService {
	
	 @Autowired
	    private BookRepository bookRepo;
	 
	 
	 public Books createBook(Books b,User user) {
		 b.setUser(user);
	        return bookRepo.save(b);
	    }
	 
	 
	 
	 public Books editBook(Books b,User user) {
		 b.setUser(user);
	        return bookRepo.save(b);
	    }
	 
	 public void deleteBook(Long id) {
	        bookRepo.deleteById(id);
	    }
	 
	 
	 public List<Books> allBooks() {
	    	
	        return bookRepo.findAll();
	    }
	 
	 public Optional<Books> FindBookById(Long id) {
	    	
	        return bookRepo.findById(id);
	    }
	 

}
