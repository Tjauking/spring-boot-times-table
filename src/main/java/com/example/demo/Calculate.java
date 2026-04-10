package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculate {
	@GetMapping("/")
	public String showForm() {
		return "index";
	}
	
	@PostMapping("/calculate")
	public String calculateTable(@RequestParam("name") String name,Model model) {
		String [] result=new String[5];
		for(int i=0;i<5;i++) {
			result[i]=name;
			
		}
		model.addAttribute("name",name);
		model.addAttribute("result",result);
		return "result";
	}
	
	
	

	
}
