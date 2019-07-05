package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserImpl;
import com.example.demo.dao.UserRoleImpl;
import com.example.demo.model.User;

@RestController
public class HomeRestController {

	// @Autowired
	UserImpl userDao;

	@Autowired
	UserRoleImpl userRoleDao;

	@Autowired
	public HomeRestController(UserImpl userDao, UserRoleImpl userRoleDao) {
		this.userDao = userDao;
		this.userRoleDao = userRoleDao;
	}

	@CrossOrigin
	@RequestMapping("/getAllUser")
	public List<User> home() {
		List<User> list = userDao.findAll();
		
		System.out.println(list);
		return list;
	}

}
