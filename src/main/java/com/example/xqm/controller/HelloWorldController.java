package com.example.xqm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xqm.dto.User;
import com.example.xqm.service.UserService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/hello")
    public String hello(User user) {
    	
    	return service.getUser(user);
        
    }
    
    @RequestMapping("/hello22222222")
    public String hello() {
    	
    	return "hello";
        
    }
}
