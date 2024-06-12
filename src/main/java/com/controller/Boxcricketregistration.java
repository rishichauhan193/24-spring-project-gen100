package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Boxcricket;
import com.utill.Validators;

@Controller
public class Boxcricketregistration {
	
	@GetMapping("/boxcricketregistration")
	public String boxRegistration() {
		return "boxcricket";
	}
	
	@PostMapping("/savereg")
	public String saveRegistration(Boxcricket studentBox,Model model) {
			
		System.out.println(studentBox.getStudentName());
		System.out.println(studentBox.getPlayerType());
		System.out.println(studentBox.getFoodPreference());
		System.out.println(studentBox.getDrink());
		
		boolean isError = false;
		

		if (Validators.isBlank(studentBox.getStudentName())) {
			isError = true;
			model.addAttribute("studentNameError","Please Enter Student Name");
		}else if(Validators.isAlpha(studentBox.getStudentName())) {
			isError = true;
			model.addAttribute("studentNameError","Please Enter Valied Student Name");
		}else {
			model.addAttribute("studentNameValue",studentBox.getStudentName());
		}

		if (Validators.isBlank(studentBox.getPlayerType())) {
			isError = true;
			model.addAttribute("playerTypeError","Please Select PlayerType");
		}else {
			model.addAttribute("playerTypeValue",studentBox.getPlayerType());
		}

		if (Validators.isBlank(studentBox.getFoodPreference())) {
			isError = true;
			model.addAttribute("foodPreferenceError","Please Selecct FoodPreference");
		}else {
			model.addAttribute("foodPreferenceValue",studentBox.getFoodPreference());
		}
		
		if (Validators.isBlank(studentBox.getDrink())) {
			isError = true;
			model.addAttribute("DrinkError","Please Select Your Drink");
		}else {
			model.addAttribute("drinkValue",studentBox.getDrink());
		}
         
		model.addAttribute("studentBox",studentBox);
		if (isError) {
			return "boxcricket";
		} else {
			model.addAttribute("reg", studentBox);
			return "RegDetail";
		}
	}

}
