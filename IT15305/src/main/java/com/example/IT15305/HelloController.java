package com.example.IT15305;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@RequestMapping(value = "NewFile.php")
	public String HelloWorld(Model model) {
		model.addAttribute("message", "Spring MVC");
		return "NewFile";
	}
	
	@RequestMapping(value = "/")
	public String helloWorld1() {
		return "indexx";
	}
}
