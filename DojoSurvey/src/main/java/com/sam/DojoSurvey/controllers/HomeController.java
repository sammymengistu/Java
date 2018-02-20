package com.sam.DojoSurvey.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}
	@RequestMapping(path="process", method=RequestMethod.POST)
    public String processresults(@RequestParam(value="name") String name, 
    	@RequestParam(value="location") String location,
    	@RequestParam(value="lang") String lang,
    	@RequestParam(value="comment") String comment, HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	// Our form's action goes to "/process" with a POST method, so this
	// stores that information from the form to our session
	
	@RequestMapping("result")
		public String displayresults(HttpSession session) {
			return session.getAttribute("lang").equals("Java") ? "java.jsp" : "result.jsp";
		}
	

		
	
}

