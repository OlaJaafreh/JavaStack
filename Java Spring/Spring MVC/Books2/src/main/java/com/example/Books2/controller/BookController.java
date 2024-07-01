package com.example.Books2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Books2.models.Book;
import com.example.Books2.services.Services;



@Controller
public class BookController {
//    @Autowired
//    private Services bookService;
    
        private final Services bookService;
        public BookController(Services bookService){
            this.bookService = bookService;
        }

    @RequestMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "NewFile.jsp";
    }
}