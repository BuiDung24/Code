package com.example.IT15305;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentaaaaaaaaa")
public class StudentController {

	@GetMapping("/get")
	public String get() {
		return "get";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String update() {
		return "update";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping("/add")
	public String add() {
		return "aff";
	}
		
}
