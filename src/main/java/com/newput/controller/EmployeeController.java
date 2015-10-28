package com.newput.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView welcomePage(){
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", "Welcome User For Spring MVC");
		return model;
	}
	
	@RequestMapping(value="/userName", method=RequestMethod.GET)	
	public ModelAndView userName(@RequestParam("name") String name){
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", name);
		return model;
	}
	
}
