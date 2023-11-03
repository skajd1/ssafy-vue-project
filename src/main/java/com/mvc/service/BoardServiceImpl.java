package com.mvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.mapper.BoardMapper;
import com.mvc.vo.Board;
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;
	
	@Override
	public ArrayList<Board> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public ArrayList<Board> selectByUser(String user) {

		return mapper.selectByUser(user);
	}

	@Override
	public ArrayList<Board> selectByAddr(String addr) {
		return mapper.selectByAddr(addr);
	}

	@Override
	public ArrayList<Board> selectByType(String type) {
		return mapper.selectByType(type);
	}

	@Override
	public ArrayList<Board> selectByTitle(String title) {
		return mapper.selectByTitle(title);
	}
	
	@Override
	public ArrayList<Board> selectByContent(String content) {
		return mapper.selectByContent(content);
	}

	@Override
	public int insert(Board b) {
		return mapper.insert(b);
	}

	@Override
	public int delete(String id) {
		return mapper.delete(id);
	}

	@Override
	public int update(Board b) {
		return mapper.update(b);
	}

}
