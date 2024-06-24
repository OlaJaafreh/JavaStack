package com.example.DisplayDate;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller

public class DisplayDate {
	
	String dateFormat = "EEE, MMM d, yyyy";
	SimpleDateFormat FinaldateFormatt = new SimpleDateFormat(dateFormat);
	String FinaldateFormat = FinaldateFormatt.format(new java.util.Date());
	
	String timeFormat = "h:mm a";
	SimpleDateFormat FinaltimeFormatt = new SimpleDateFormat(timeFormat);
	String FinaltimeFormat = FinaltimeFormatt.format(new java.util.Date());
	
	@RequestMapping("/")
	public String index() {
		return "NewFile.jsp";
	}
	
	@RequestMapping("/date")
	public String getDate(Model model) {
		model.addAttribute("FinaldateFormat",FinaldateFormat);
		return "Date.jsp";
	}
	
	@RequestMapping("/time")
	public String getTime(Model model) {
		model.addAttribute("FinaltimeFormat",FinaltimeFormat);
		return "Time.jsp";
	}



}
