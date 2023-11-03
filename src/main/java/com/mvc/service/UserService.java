package com.mvc.service;

import java.util.ArrayList;

import com.mvc.vo.User;

//Controller를 위한 인터페이스
public interface UserService {
	public ArrayList<User> selectAll();
	public User selectOne(String id);
	public int insert(User c);
	public int delete(String id);
	public int update(User c);
}
