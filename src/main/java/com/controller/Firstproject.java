package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Userbean;


@Controller
public class Firstproject  {

	
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome";
	}
	
	@GetMapping("/login")
	public String login(){
		return "Login";
	}
	
	@GetMapping("/signup")
	public String signup(){
		return "Signup";
	}
	
	@GetMapping("/forpass")
	public String forgetPassword(){
		return "Forgotpassword";
	}
	
	@PostMapping("/saveuser")
	public String saveuser(Userbean userbean,Model model){
		System.out.println("FirstName: " + userbean.getFirstName());
		System.out.println("Email: " + userbean.getEmail());
		System.out.println("Password: " + userbean.getPassword());
		
		model.addAttribute("user",userbean);
		return "Home";
	}
	
	
}
