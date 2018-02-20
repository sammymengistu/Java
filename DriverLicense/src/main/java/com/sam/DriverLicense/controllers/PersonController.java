package com.sam.DriverLicense.controllers;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sam.DriverLicense.models.Person;
import com.sam.DriverLicense.services.PersonService;
@Controller
@RequestMapping("/persons")
public class PersonController {
private PersonService personService;
	
	public PersonController(PersonService personService){
		this.personService = personService;
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") long id,Model model){
		model.addAttribute("person",personService.findByIndex(id));
		return "show_person.jsp";
	}
	
	@RequestMapping("/new")
	public String _new(Model model){
		model.addAttribute("person",new Person());
		return "new_person.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("person") Person person,BindingResult res,RedirectAttributes re,Model model){		
		if(res.hasErrors()){
			re.addFlashAttribute("errs",res.getAllErrors());
			return "redirect:/persons/new";
		}else{
			personService.create(person);
			return "redirect:/licenses/new";
		}
	}

}
