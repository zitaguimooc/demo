package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("name", "二十七");
		return "test/test";
	}
}
