package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Instance variables - accessible by the whole class
	
	private int russetCount;
	private int goldenCount;
	private int sweetCount;
	// private int noneCount;
	
	// The defaultPage method will return the page templates/potato.html
	// For anything hitting "/" - or localhost:8080

	@RequestMapping("/")
	public String defaultPage() {
		return "potato";
	} // closes defaultPage method

	// The twiceBaked ModelAndView will return the page tepmlates/survey.html
	// For anything hitting "localhost:8080/twice-baked"
	// And performs data substitution back to the view using Moustache

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {

		// Variable declaration - type (ModelAndView) and name (carbs)
		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("twice-baked");
		carbs.addObject("adjective", "delicious");
		carbs.addObject("degrees", 425);

		return carbs;
	} // closes twiceBaked

	// The survey ModelAndView will handle survey results
	// It will display the name of the selection from the user at /survey

	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {

		ModelAndView survey = new ModelAndView();
		survey.setViewName("results");
		survey.addObject("userResponse", answer);
		
		if (answer.equals("Russet")) {
			// russetCount = russetCount + 1;
			// Add and assign operator (option:
			russetCount += 1;
		} 
		if (answer.equals("Golden")) {
			goldenCount = goldenCount + 1;
		} 
		if (answer.equals("Sweet")) {
			sweetCount = sweetCount + 1;
		}
		
		survey.addObject("russetCount", russetCount);
		survey.addObject("goldenCount", goldenCount);
		survey.addObject("sweetCount", sweetCount);
		
		return survey;
	} // closes survey
	
	// The reset ModelAndView will set survey results back to zero
	
	@RequestMapping("/reset")
	public ModelAndView reset() {
		
		ModelAndView reset = new ModelAndView();
		
		russetCount = 0;
		goldenCount = 0;
		sweetCount = 0;
		
		reset.addObject("russetCount", russetCount);
		reset.addObject("goldenCount", goldenCount);
		reset.addObject("sweetCount", sweetCount);
		
		return reset;
	}	

} // closes class
