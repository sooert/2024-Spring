package com.my.ds_open_market.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.ds_open_market.entity.User;

@Controller
public class ViewController {

	// 로그인 여부 확인 후 페이지 이동
	private String getViewName(HttpSession session, String viewName) {
		User me = (User) session.getAttribute("me");
		if (me == null) {
			return "redirect:/login";
		}
		return viewName;
	}

	/**
	 * 홈 페이지 이동 http://127.0.0.1:8080/ds_open_market/home
	 */
	@GetMapping("home")
	public String home() {
		return "home";
	}

	/**
	 * 회원가입 페이지 이동 http://127.0.0.1:8080/ds_open_market/save-user
	 */
	@GetMapping("save-user")
	public String saveUser() {
		return "save-user";
	}

	/**
	 * 상품등록 페이지 이동 http://127.0.0.1:8080/ds_open_market/save-item
	 */
	@GetMapping("save-item")
	public String saveItem(HttpSession session) {
		return getViewName(session,"save-item");
	}

	/**
	 * 로그인 페이지 이동 http://127.0.0.1:8080/ds_open_market/login
	 */
	@GetMapping("login")
	public String login() {
		return "login";
	}

	

}
