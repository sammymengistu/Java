package com.sam.DisplayDate.controllers;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class HomeController {
	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "displaydate.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) { 
		Date time = new Date();
		model.addAttribute("time", time);
		return "displaytime.jsp";
	}
}
