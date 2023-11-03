package com.mvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.mapper.UserMapper;
import com.mvc.vo.User;
@Service
public class UserServiceImpl implements UserService{
	
	private UserMapper mapper;
	@Autowired
	UserServiceImpl(UserMapper mapper){
		this.mapper = mapper;
	}
	@Override
	public ArrayList<User> selectAll() {
		return mapper.selectAll();
	}
	@Override
	public User selectOne(String id) {
		return mapper.selectOne(id);
	}
	@Override
	public int insert(User u) {
		return mapper.insert(u);
	}
	@Override
	public int delete(String id) {
		return mapper.delete(id);
	}
	@Override
	public int update(User u) {
		return mapper.update(u);
	}
	@Override
	public boolean checkUser(User u) {
		User res = mapper.checkUser(u);
		if(res == null) return false;
		return true;
	}


	

	

}






