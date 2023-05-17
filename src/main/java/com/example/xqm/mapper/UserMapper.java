package com.example.xqm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.xqm.dto.User;

@Mapper
public interface UserMapper {
	
    public User getUser(String userName,String password);

}
