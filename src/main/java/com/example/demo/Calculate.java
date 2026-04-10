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
	public String calculateTable(@RequestParam("num") int num,Model model) {
		int [] result=new int[10];
		for(int i=1;i<10;i++) {
			result[i-1]=num*i;
			
		}
		model.addAttribute("result",result);
		model.addAttribute("num",num);
		return "result";
	}
	
	
	

	
}
