package com.mvc.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.vo.User;

@Mapper
public interface UserMapper {
	public ArrayList<User> selectAll();
	public User selectOne(String id);
	public int insert(User c);
	public int delete(String id);
	public int update(User c);
}
