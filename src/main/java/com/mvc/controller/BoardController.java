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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "SSAFY")
@RestController
public class BoardController {
	@Autowired
	BoardService service;
	
	@ApiOperation(value = "전체 게시판 목록",notes = "게시판의 모든 글을 보기 위해사용")
	@GetMapping("/board")
	public ArrayList<Board> selectAll() {
		return service.selectAll();
	}
	@ApiOperation(value = "유저 게시판 목록",notes = "검색한 유저의 모든 글을 보기 위해사용")
	@GetMapping("/board/user/{user}")
	public ArrayList<Board> selectByUser(@PathVariable String user) {
		return service.selectByUser(user);
	}
	@GetMapping("/board/addr/{addr}")
	@ApiOperation(value = "주소 게시판 목록",notes = "주소로 검색한 모든 글을 보기 위해사용")
	public ArrayList<Board> selectByAddr(@PathVariable String addr) {
		return service.selectByAddr(addr);
	}
	@GetMapping("/board/type/{type}")
	@ApiOperation(value = "타입 게시판 목록",notes = "타입으로 검색한 모든 글을 보기 위해사용")
	public ArrayList<Board> selectByType(@PathVariable String type) {
		return service.selectByType(type);
	}
	@GetMapping("/board/title/{title}")
	@ApiOperation(value = "제목 게시판 목록",notes = "제목으로 검색한 모든 글을 보기 위해사용")
	public ArrayList<Board> selectByTitle(@PathVariable String title) {
		return service.selectByTitle(title);
	}
	@GetMapping("/board/content/{content}")
	@ApiOperation(value = "내용 게시판 목록",notes = "내용으로 검색한 모든 글을 보기 위해사용")
	public ArrayList<Board> selectByContent(@PathVariable String content) {
		return service.selectByContent(content);
	}
	@PostMapping("/board/insert")
	@ApiOperation(value = "글 작성",notes = "게시판에 새로운 글을 작성 위해사용")
	public int insert(@RequestBody Board b) {
		return service.insert(b);
	}
	@DeleteMapping("/board/delete/{id}")
	@ApiOperation(value = "삭제",notes = "게시판의 글을 삭제하기 위해사용")
	public int delete(@PathVariable String id) {
		return service.delete(id);
	}
	@PutMapping("/board/update")
	@ApiOperation(value = "수정",notes = "게시판의 글을 수정하기 위해사용")
	public int update(@RequestBody Board b) {
		return service.update(b);
	}
	
}
