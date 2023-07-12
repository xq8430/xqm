package com.example.xqm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.xqm.dto.User;

@Mapper
public interface UserMapper {
	
    User getUser(String name,String password);
    
    List<User> getUser1();

}
