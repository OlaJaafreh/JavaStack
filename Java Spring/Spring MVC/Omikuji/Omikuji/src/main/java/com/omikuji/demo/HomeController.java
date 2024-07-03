package com.omikuji.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String form() {
		return "form.jsp";

}
	@RequestMapping("/process")
	public String processForm(
        @RequestParam(value="number") int number,
        @RequestParam(value="city") String city,
        @RequestParam(value="person") String person,
        @RequestParam(value="hobby") String hobby,
        @RequestParam(value="thing") String thing,
        @RequestParam(value="nice") String nice,
//        Model model,
        HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);
		return "redirect:/result";

}
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";

}
}
