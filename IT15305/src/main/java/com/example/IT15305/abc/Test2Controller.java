package com.example.IT15305.abc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ab")
public class Test2Controller {
	
	@GetMapping("/test2")
	public String test() {
		return "students/new";
	}
	
	@GetMapping("/seach")
	public String search() {
		return "students/search";
	}
	
	@GetMapping("/a")
	public String home() {
		return "students/index";
	}
	
	@GetMapping
	public String index() {
		return "indexx";
	}
}
