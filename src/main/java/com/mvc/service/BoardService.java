package com.mvc.service;

import java.util.ArrayList;

import com.mvc.vo.Board;

public interface BoardService {
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
