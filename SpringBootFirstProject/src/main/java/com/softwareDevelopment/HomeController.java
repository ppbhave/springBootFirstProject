package com.softwareDevelopment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/passStudentToDisplay")
	public String add(@ModelAttribute com.softwareDevelopment.model.StudentModel st)
	{		
		return "displayResult";
	}
	
}

