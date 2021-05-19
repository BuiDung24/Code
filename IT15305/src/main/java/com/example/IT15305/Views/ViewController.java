package com.example.IT15305.Views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("a")
public class ViewController {

	@GetMapping("NewFile")
	public String helloView() {
		return "NewFile";
	}
}
