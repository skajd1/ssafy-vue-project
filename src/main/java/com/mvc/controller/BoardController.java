package com.mvc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.BoardService;
import com.mvc.vo.Board;


@RestController
public class BoardController {
	@Autowired
	BoardService service;
	@GetMapping("/board")
	public ArrayList<Board> selectAll() {
		return service.selectAll();
	}
	@GetMapping("/board/user/{user}")
	public ArrayList<Board> selectByUser(@PathVariable String user) {
		return service.selectByUser(user);
	}
	@GetMapping("/board/addr/{addr}")
	public ArrayList<Board> selectByAddr(@PathVariable String addr) {
		return service.selectByAddr(addr);
	}
	@GetMapping("/board/type/{type}")
	public ArrayList<Board> selectByType(@PathVariable String type) {
		return service.selectByType(type);
	}
	@GetMapping("/board/title/{title}")
	public ArrayList<Board> selectByTitle(@PathVariable String title) {
		return service.selectByTitle(title);
	}
	@GetMapping("/board/content/{content}")
	public ArrayList<Board> selectByContent(@PathVariable String content) {
		return service.selectByContent(content);
	}
	@PostMapping("/board/insert")
	public int insert(@RequestBody Board b) {
		return service.insert(b);
	}
	@DeleteMapping("/board/delete/{id}")
	public int delete(@PathVariable String id) {
		return service.delete(id);
	}
	@PutMapping("/board/update")
	public int update(@RequestBody Board b) {
		return service.update(b);
	}
	
}
