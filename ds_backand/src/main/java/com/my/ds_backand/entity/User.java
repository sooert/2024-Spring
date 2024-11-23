package com.my.ds_backand.entity;

public class User {
	// 암호화 키 셋팅
	// source > gett 으로 받기
	private int user_index = 0;
	private String nick = null;
	private String id = null;
	private String pw = null;
	private String created_date = null;
	private String User_code = null;

	public int getUser_index() {
		return user_index;
	}

	public void setUser_index(int user_index) {
		this.user_index = user_index;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public void setUser_code(String User_code) {
		this.User_code = User_code;

	}
}
