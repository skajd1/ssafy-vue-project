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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User selectOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insert(User c) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(User c) {
		// TODO Auto-generated method stub
		return 0;
	}


	

	

}






