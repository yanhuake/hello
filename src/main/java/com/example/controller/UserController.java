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
	public int hasUser(String uname,String pwd) {
		System.out.println(uname+"===="+pwd);
		return userService.hasUser(uname, pwd);
	}
}
