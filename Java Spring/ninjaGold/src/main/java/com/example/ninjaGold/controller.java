package com.example.ninjaGold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class controller {
	
	Random rand = new Random();
	int Yourgold = 0;
 	ArrayList<String> activities = new ArrayList<String>();
 	
	
	
	@RequestMapping("/")
	public String index(Model model) {
		return "Main.jsp";
	
}
	
	@PostMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	
}
	
	@PostMapping("/FindGold")
    public String FindGold(HttpSession session,@RequestParam("FCHQ") String FCHQ) {
		
		if (session.getAttribute("Yourgold") == null) {
            session.setAttribute("Yourgold", 0);
        }
		
		if ("farm".equals(FCHQ)) {
		
		int number = rand.nextInt(20 - 10 + 1) + 10;
        session.setAttribute("number1020", number);
        int x = (int) session.getAttribute("Yourgold") ;
        session.setAttribute("Yourgold", x+ number);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
		String formattedDate = dateFormat.format(new java.util.Date());
        
//        ArrayList<String> temp_activities = (ArrayList<String>) session.getAttribute("activities");
		activities.add(0, "you enterd a farm and earned " + number + " gold (" + formattedDate +")");
		 } else if ("cave".equals(FCHQ)) {
			 int number = rand.nextInt(10 - 5 + 1) + 5;
		        session.setAttribute("number510", number);
		        int x = (int) session.getAttribute("Yourgold") ;
		        session.setAttribute("Yourgold", x+ number);
		        
		        SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
				String formattedDate = dateFormat.format(new java.util.Date());
		        
//		        ArrayList<String> temp_activities = (ArrayList<String>) session.getAttribute("activities");
				activities.add(0, "you enterd a cave and earned " + number + " gold (" + formattedDate +")");
				
		 }
	 else if ("house".equals(FCHQ)) {
		int number = rand.nextInt(5 - 2 + 1) + 2;
        session.setAttribute("number25", number);
        int x = (int) session.getAttribute("Yourgold") ;
        session.setAttribute("Yourgold", x+ number);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
		String formattedDate = dateFormat.format(new java.util.Date());
        
//        ArrayList<String> temp_activities = (ArrayList<String>) session.getAttribute("activities");
		activities.add(0, "you enterd a house and earned " + number + " gold (" + formattedDate +")");
		
		
	}
	 else if ("quest".equals(FCHQ)) {
		 int number = rand.nextInt(50 + 50 + 1) - 50;
	        session.setAttribute("number050", number);
	        int x = (int) session.getAttribute("Yourgold");
	        session.setAttribute("Yourgold", x+ number);
	        
	        SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
			String formattedDate = dateFormat.format(new java.util.Date());
	        
			if(number>0) {
			activities.add(0, "you completed a quest and earned " + number + " gold (" + formattedDate +")");
			}
			if(number<0) {
				activities.add(0, "You faild and lost " + number + " Ouch (" + formattedDate +")");
				}
			
		 
	 }
		session.setAttribute("activities", activities);
		
        return "redirect:/";
        } 
	
	

	
	
	


}
