package com.mvc.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
	String id;
	String title;
	String type;
	String addr;
	String user;
	String content;
	String img;
	public Board(String title,String addr,String user,String content) {
		this.title=title;
		this.addr=addr;
		this.user=user;
		this.content=content;
	}
}
