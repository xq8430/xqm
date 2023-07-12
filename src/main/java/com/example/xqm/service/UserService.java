package com.example.xqm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.xqm.dao.UserDao;
import com.example.xqm.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	
	public String getUser(User user) {
		
		List<User> DBuser = userDao.selectUser(null);
		if(DBuser == null) {
			return "error";
		}else {
			return "OK";
		}
	}
}
