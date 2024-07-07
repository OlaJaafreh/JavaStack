package com.example.BookClub.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Books {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    
    @NotEmpty(message="Title is required!")
    @Size(min=3, max=30, message="Book title must be between 3 and 30 characters")
    private String title;
    
    @NotEmpty(message="Author name is required!")
    @Size(min=3, max=30, message="Author name must be between 3 and 30 characters")
    private String authorName;  // Corrected property name
  
    @NotEmpty(message="Thoughts is required!")
    @Size(min=10, max=300, message="Thoughts must be between 10 and 300 characters")
    private String userThoughts;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    private User user;

    // Getter and setter methods
    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {  // Corrected getter method name
        return authorName;
    }

    public void setAuthorName(String authorName) {  // Corrected setter method name
        this.authorName = authorName;
    }

    public String getUserThoughts() {
        return userThoughts;
    }

    public void setUserThoughts(String userThoughts) {
        this.userThoughts = userThoughts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
