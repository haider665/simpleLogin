package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.UserImpl;
import com.example.demo.dao.UserRoleImpl;
import com.example.demo.model.Test;
import com.example.demo.model.User;
import com.example.demo.model.UserRole;

@Controller
public class HomeController {
	
	//@Autowired
	UserImpl userDao;
	
	@Autowired
	UserRoleImpl userRoleDao;
	
	@Autowired
	public HomeController(UserImpl userDao,UserRoleImpl userRoleDao) {
		this.userDao=userDao;
		this.userRoleDao=userRoleDao;
	}
//	@Autowired
//	public HomeController(UserRoleImpl userRoleDao) {
//		this.userRoleDao=userRoleDao;
//	}
	
	@RequestMapping("/")
	public String home(Authentication auth,Model model) {
		System.out.println(userDao.findAll());
		System.out.println(auth.getName());
		System.out.println(auth.getAuthorities());
		List<Object> list = (List<Object>) auth.getAuthorities();
		boolean adminCheck=false;
		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
			if(list.get(i).toString().equals("ROLE_ADMIN")) {
				System.out.println("---------------------------");
				adminCheck=true;
				break;
			}
		}
		if(adminCheck==true) {
			System.out.println("admin");
			return "redirect:/admin";
		}
		return "redirect:/profile";
	}
	
	@RequestMapping("/profile")
	public String profile(Authentication auth, Model model) throws Exception {
		User user=userDao.getOne(auth.getName());
		model.addAttribute("user", user);
		return "index";
	}
	@RequestMapping("changePassword")
	public String changePassword(Authentication auth, Model model) throws Exception {
		return "newPass";
	}
	@RequestMapping("changePassword/processPassword")
	public String processPassword(Authentication auth, @RequestParam("oldPass") String oldPass,
			@RequestParam("newPass") String newPass, @RequestParam("confPass") String confPass, Model model) throws Exception {
		System.out.println("----------------------------------");
		String userId= auth.getName();
		User user= userDao.getOne(userId);
		if(user.getPassword().equals("{noop}"+oldPass) && confPass.equals(newPass)) {
			user.setPassword("{noop}"+newPass);
			userDao.saveAndFlush(user);
		} else {
			return "redirect:/message";
		}
		return "redirect:/message2";
	}
	
	@RequestMapping("/login")
	public String login() throws Exception {
		return "login";
	}
	
	@RequestMapping("/admin")
	public String admin() throws Exception {
		return "admin";
	}
	
	@RequestMapping("/message")
	public String failMessage(Model model) throws Exception {
		model.addAttribute("msg", "Failed..!!");
		return "success";
	}
	@RequestMapping("/message2")
	public String successMessage(Model model) throws Exception {
		model.addAttribute("msg", "Successful..!!");
		return "success";
	}
	@RequestMapping("/testForm")
	public String testForm(@Valid @ModelAttribute("test") Test t, BindingResult res) throws Exception {
		if(res.hasErrors()) {
			return "test";
		}
		return "login";
	}
	
	@RequestMapping("/signUp")
	public String signUp(Model model) throws Exception {
		model.addAttribute("user", new User());
		return "signUp";
	}
	
	@PostMapping("/processSignUp")
	public String processSignUp(@Valid @ModelAttribute("user") User user, BindingResult bindResult, Model model) throws Exception {
		if(bindResult.hasErrors() || !user.getPassword().equals(user.getConfirmPassword())) {
			if( user.getPassword() != null && user.getConfirmPassword()!=null) {
				if(!user.getPassword().equals(user.getConfirmPassword())) {
					model.addAttribute("message", "Password mismatch");					
				}
			}else {
				model.addAttribute("message", "Fill up everything");	
			}
			return "signUp";
		} else {user.setPassword("{noop}"+user.getPassword());
			System.out.println(user);
			UserRole userRole = new UserRole("ROLE_EMPLOYEE");
			user.add(userRole);
			userRoleDao.save(userRole);
			return "login";
		}
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrim = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrim);
	}
	
	
}
