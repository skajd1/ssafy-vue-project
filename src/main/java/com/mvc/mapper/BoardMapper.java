package com.mvc.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.vo.Board;
@Mapper
public interface BoardMapper {
	public ArrayList<Board> selectAll();
	
	public ArrayList<Board> selectByUser(String user);
	public ArrayList<Board> selectByAddr(String addr);
	public ArrayList<Board> selectByType(String type);
	public ArrayList<Board> selectByTitle(String title);
	public ArrayList<Board> selectByContent(String content);
	
	public int insert(Board b);
	public int delete(String id);
	public int update(Board b);
}
