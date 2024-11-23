package com.my.ds_open_market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	/**
	 * 홈 페이지 이동
	 * http://127.0.0.1:8080/ds_open_market/home
	 */
	@GetMapping("home")
	public String home() {
		return "home";
	}

	/**
	 * 회원가입 페이지 이동
	 * http://127.0.0.1:8080/ds_open_market/save-user
	 */
	@GetMapping("save-user") 
	public String saveUser() {
		return "save-user";
	}

	/**
	 * 로그인 페이지 이동
	 * http://127.0.0.1:8080/ds_open_market/login
	 */
	@GetMapping("login")
	public String login() {
		return "login";
	}

	/**
	 * 상품등록 페이지 이동
	 * http://127.0.0.1:8080/ds_open_market/save-item
	 */
	@GetMapping("save-item")
	public String saveItem() {
		return "save-item";
	}

	

}
