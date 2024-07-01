package com.example.book3.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.book3.models.Book;
import com.example.book3.services.Services;

@Controller
public class BookController {
    private final Services bookService;
    
    public BookController(Services bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "NewFile.jsp";
    }
}
