package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService ;
	
	@RequestMapping("/hasUser.do")
	@ResponseBody
	public int hasUser(String username,String password) {
		System.out.println(username+"===="+password);
		return userService.hasUser(username, password);
	}
}
