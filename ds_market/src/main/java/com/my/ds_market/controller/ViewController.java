package com.my.ds_market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.ds_market.entity.User;
import com.my.ds_market.service.UserService;

@Controller
public class ViewController {

	@Autowired
	UserService userService;

	// JSP 실행
	@GetMapping("front")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String front() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "front";
	}

	// 회원리스트
	@GetMapping("market")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String market() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "market";
	}

	// 회원가입
	@GetMapping("save-user")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String saveUser() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "save-user";
	}

	// 물건 판매 리스트
	@GetMapping("item")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String Item() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "item";
	}

	// 물건 판매 리스트
	@GetMapping("save-item")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String saveItem() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "save-item";

	}

	// http://127.0.0.1:8080/ds_market/detail-user?code=
	// 회원정보
	// userDao , DB 확인
	@GetMapping("detail-user")
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String detailUser(@RequestParam(value = "code") String code, Model model) {
		User user = userService.findByCode(code);

		model.addAttribute("user", user);

		// return 을 해야 다기 front 로 신호가 돌아감
		return "detail-user";
	}

}
