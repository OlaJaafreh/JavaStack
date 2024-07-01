package com.example.BooksAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.BooksAPI.models.Book;
import com.example.BooksAPI.repo.RepositoryBooks;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final RepositoryBooks bookRepository;
    
    public BookService(RepositoryBooks bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}