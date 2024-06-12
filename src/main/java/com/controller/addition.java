package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Calcbean;




@Controller
public class addition {
	@GetMapping("/add")
	public String add(Model model){
		model.addAttribute("calcbean",new Calcbean());
		return "add";
	}
	
	@PostMapping("/calc")
	public String calc(Calcbean calcbean,Model model){
		System.out.println("Total: " + calcbean.getTotal());
		model.addAttribute("calcbean",calcbean);
		return "calc";
	}

}
