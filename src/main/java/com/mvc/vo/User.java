package com.mvc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	String id;
	String pw;
	int admin;
	public boolean isAdmin() {
		if (admin == 1) return true;
		return false;
		
	}
}
