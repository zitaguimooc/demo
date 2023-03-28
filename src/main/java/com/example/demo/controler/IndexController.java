package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class IndexController {
	
	//@RequestMapping(value="/hello", method=RequestMethod.GET)
	//@PostMapping("/hello")
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "Registry");
		return "test/Hello";
	}
}
