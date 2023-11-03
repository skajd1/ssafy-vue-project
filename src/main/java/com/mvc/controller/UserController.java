package com.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.UserService;
import com.mvc.vo.User;

@RestController
public class UserController {
	
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}
	
	@GetMapping(value = "/user")
	public ArrayList<User> getAllUser() {
		return us.selectAll();
	}
	@PostMapping(value = "/user")
	public String registUser(@RequestBody User u) {
		int res = us.insert(u);
		if(res==1) return "가입 성공";
		return "가입 실패";
	}
	@PutMapping(value = "/user")
	public String updateUser(@RequestBody User u) {
		int res = us.update(u);
		if(res==1) return "수정 성공";
		return "수정 실패";
	}
	@GetMapping(value = "/user/id/{id}")
	public User getUser(@PathVariable String id) {
		return us.selectOne(id);
	}
	@DeleteMapping(value = "/user/id/{id}")
	public String deleteUser(@PathVariable String id) {
		int res = us.delete(id);
		if(res==1) return "회원 삭제 성공";
		return "삭제 실패";
	}
	@PostMapping(value = "/user/login")
	public String login(@RequestBody User u, HttpSession session) {
		boolean res = us.checkUser(u);
		String msg = null;
		if(res) {
			session.setAttribute("user", u);
			msg = "로그인 성공";
		}
		msg = "ID / PW 를 확인해주세요.";
		return msg;
	}
	@PostMapping(value = "/user/logout")
	public void logout(HttpSession session,HttpServletResponse res) {
		session.invalidate();
		try {
			res.sendRedirect("index");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
