package com.example.BookClub.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.BookClub.Models.Books;
import com.example.BookClub.Models.LoginUser;
import com.example.BookClub.Models.User;
import com.example.BookClub.Serv.BookService;
import com.example.BookClub.Serv.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @Autowired
    private BookService bookServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "login.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
                           BindingResult result, Model model, HttpSession session) {
        User registeredUser = userServ.register(newUser, result);
        
        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "login.jsp";
        }
        
        // Store user ID in session (log them in)
        session.setAttribute("userId", registeredUser.getId());
        
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
                        BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        
        if (result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "login.jsp";
        }
        
     
        session.setAttribute("userId", user.getId());
        
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/";
        }
        
        
        
        Optional<User> user = userServ.findUserById(userId);
        if (user.isPresent()) {
//        	System.out.print(bookServ.allBooks());
            model.addAttribute("user", user.get());
            model.addAttribute("books", bookServ.allBooks());
            return "home.jsp";
        } else {
            session.invalidate();
            return "redirect:/";
        }
    }
    
    
    @GetMapping("/book/{id}")
    public String details(@PathVariable("id") Long id, HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/";
        } else {
        	Optional<User> optionaluser = userServ.findUserById(userId);
        	 if (optionaluser.isPresent()) {
        		 User user = optionaluser.get();
        		 model.addAttribute("user",user );
        	 }
        	 else { 
        		 return "redirect:/";
        	 }
            Optional<Books> optionalBook = bookServ.FindBookById(id);
            if (optionalBook.isPresent()) {
                Books book = optionalBook.get();
                System.out.print(book.getUser().getId());
                model.addAttribute("book", book);
                return "details.jsp";
            } else {
                return "redirect:/"; 
            }
        }
    }
    
    @GetMapping("/books/new")
    public String newBook(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
        	 return "redirect:/";
        } else {
            model.addAttribute("newBook", new Books()); 
            model.addAttribute("user", userServ.findUserById(userId));
            return "new.jsp";
        }
    }
    
    
    
    @GetMapping("/book/{book_id}/edit")
    public String editBook(@PathVariable("book_id") Long book_id,HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
        	 return "redirect:/";
        } else {
        	Optional<Books> optionalBook = bookServ.FindBookById(book_id);
            if (optionalBook.isPresent()) {
                Books book = optionalBook.get();
//                System.out.print(book.getUser().getId());
                model.addAttribute("editBook", book);
                Optional<User> userOptional = userServ.findUserById(userId);
            	User user = userOptional.get();
                model.addAttribute("user", user);
                return "edit.jsp";
            } else {
                return "redirect:/"; 
            }
        }
    }
    
    @PutMapping("/edit/{book_id}")
    public String edit(@Valid @ModelAttribute("editBook") Books book, 
            BindingResult result, Model model, HttpSession session,
            RedirectAttributes redirectAttributes) {
    	 Long userId = (Long) session.getAttribute("userId");
if (result.hasErrors()) {
//redirectAttributes.addFlashAttribute(result);
return "edit.jsp";
}
if (userId == null) {
	 return "redirect:/";
} else {Optional<User> userOptional = userServ.findUserById(userId);
User user = userOptional.get();
bookServ.editBook(book,user);

}



//redirectAttributes.addFlashAttribute("message", "Book added successfully!");
return "redirect:/home";
}
    
//    @GetMapping("/book/{book_id}/edit")
//    public String showEditForm(@PathVariable("book_id") Long book_id, HttpSession session, Model model) {
//        Long userId = (Long) session.getAttribute("userId");
//        if (userId == null) {
//            return "redirect:/";
//        } else {
//            Optional<Books> optionalBook = bookServ.FindBookById(book_id);
//            if (optionalBook.isPresent()) {
//                Books book = optionalBook.get();
//                System.out.print(book.getUser().getId());
//                model.addAttribute("editBook", book);
//                return "edit.jsp";
//            } else {
//                return "redirect:/";
//            }
//        }
//    }
    
    
    @PostMapping("/shelfAdd")
    public String addBook(@Valid @ModelAttribute("newBook") Books book, 
                        BindingResult result, Model model, HttpSession session,
                        RedirectAttributes redirectAttributes) {
    	if (result.hasErrors()) {
//    		redirectAttributes.addFlashAttribute(result);
    		return "new.jsp";
    	}
    	Long userId = (Long) session.getAttribute("userId");
    	Optional<User> userOptional = userServ.findUserById(userId);
    	User posted = userOptional.get();
    	bookServ.createBook(book,posted);
    	
//    	redirectAttributes.addFlashAttribute("message", "Book added successfully!");
    	return "redirect:/home";
    }
    
    @DeleteMapping("/book/{book_id}/delete")
    public String destroy(@PathVariable("book_id") Long book_id) {
        bookServ.deleteBook(book_id);
        return "redirect:/home";
    }
    
    

    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
