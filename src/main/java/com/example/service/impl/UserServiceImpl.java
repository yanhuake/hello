package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper ;
	
	@Override
	public int hasUser(String uname,String pwd) {
		return userMapper.hasUser(uname, pwd) ;
	}
}
