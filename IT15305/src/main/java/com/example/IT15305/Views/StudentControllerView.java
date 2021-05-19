package com.example.IT15305.Views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentControllerView {
	@GetMapping()
	public String newFrom() {
		return "indexx";
	}
	@GetMapping("/add")
	public String add() {
		return "students/new";
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate() {
		return "students/edit";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "students/list";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "students/search";
	}
}
