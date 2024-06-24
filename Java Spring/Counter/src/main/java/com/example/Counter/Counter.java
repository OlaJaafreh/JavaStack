package com.example.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class Counter {
	
	@RequestMapping("/your_server")
    public String index() {
        return "NewFile.jsp";
    }
	
	
	@RequestMapping("/your_server/counter")
    public String withcounter(HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {
				Integer x = (Integer) session.getAttribute("count");
				session.setAttribute("count", x+1);
			}
		
        return "withCounter.jsp";
    }


}


