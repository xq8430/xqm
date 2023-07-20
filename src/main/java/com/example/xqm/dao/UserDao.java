package com.example.xqm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.xqm.dto.User;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
 
    public List<User> selectUser(String id) {
        String sql = "select userID,Name,Password,Email,City from users where userid = :userId";
        
        Map<String, Object> param = new HashMap<>();
        param.put("userId", 1);
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql, param);
        List<User> userList = new ArrayList<User>();
        
        for(Map<String, Object> map: mapList) {
    		User user = new User();
    		user.setUserid((int) map.get("userid"));
    		user.setName((String) map.get("name"));
    		user.setPassword((String) map.get("password"));
    		user.setEmail((String) map.get("email"));
    		user.setCity((String) map.get("city"));
    		userList.add(user);
        }
        return userList;
    }
}