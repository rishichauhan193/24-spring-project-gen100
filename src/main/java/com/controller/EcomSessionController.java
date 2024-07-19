package com.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EUserBean;
import com.dao.EUserDao;
import com.service.FileUploadService;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EcomSessionController {

	@Autowired
	EUserDao userDao;

	@Autowired
	FileUploadService fileUploadService;

	@GetMapping(value = { "/", "elogin" })
	public String welcome() {
		return "EcomLogin";
	}

	
	@PostMapping("/elogin")
	public String eLogin(EUserBean userBean, Model model, HttpSession session) {
		System.out.println("32 => " + userBean.getEmail());
		System.out.println("33 => " + userBean.getPassword());

		EUserBean dbUser = userDao.authenticate(userBean.getEmail(), userBean.getPassword());
		if (dbUser == null) {
			model.addAttribute("error", "Invalid Credentials");
			return "EcomLogin";
		} else {

			session.setAttribute("user", dbUser);
			model.addAttribute("firstName", dbUser.getFirstName());
			model.addAttribute("profilePicPath", dbUser.getProfilePicPath());
			return "EcomHome";
		}
	}

	@GetMapping("/esignup")
	public String signup() {
		return "EcomSignup";
	}

	@PostMapping("/esignup")
	public String signupPost(EUserBean userBean) {
		

		fileUploadService.uploadUserImage(userBean.getProfilePic(), userBean.getEmail());
		
		userBean.setProfilePicPath(
				"images//profilepic//" + userBean.getEmail() + "//" + userBean.getProfilePic().getOriginalFilename());

		userDao.insertUser(userBean);

		return "EcomLogin";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "redirect:/elogin";
	}

}