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
	
	
	public User getUser(User user) {
		
		List<User> DBuser = userDao.selectUser(null);
		if(DBuser == null) {
			return null;
		}else {
			return DBuser.get(0);
		}
	}
}
