package com.example.xqm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.xqm.mapper.UserMapper;

public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	
	public void getUser() {
		userMapper.getAll();
	}
}
