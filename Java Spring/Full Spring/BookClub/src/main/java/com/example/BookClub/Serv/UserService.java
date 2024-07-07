package com.example.BookClub.Serv;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.BookClub.Models.Books;
import com.example.BookClub.Models.LoginUser;
import com.example.BookClub.Models.User;
import com.example.BookClub.Repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User register(User newUser, BindingResult result) {
        if (userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }

        if (!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }

        if (result.hasErrors()) {
            return null;
        }

        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);

        return userRepo.save(newUser);
    }

    public User login(LoginUser newLoginObject, BindingResult result) {
        Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmailLog());

        if (!potentialUser.isPresent()) {
            result.rejectValue("emailLog", "NotFound", "Email not found!");
            return null;
        }

        User user = potentialUser.get();

        if (!BCrypt.checkpw(newLoginObject.getPass(), user.getPassword())) {
            result.rejectValue("pass", "Matches", "Invalid Password!");
            return null;
        }

        return user;
    }

    public Optional<User> findUserById(Long userId) {
    	
        return userRepo.findById(userId);
    }
    
    

}
