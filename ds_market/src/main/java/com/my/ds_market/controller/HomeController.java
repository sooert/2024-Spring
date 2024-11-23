package com.my.ds_market.controller;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.ds_market.entity.User;
import com.my.ds_market.service.DealService;
import com.my.ds_market.service.UserService;

@RestController
@RequestMapping(value = "api/user")
public class HomeController {

	@Autowired
	UserService userService;

	@Autowired
	DealService dealSerice;

	// http://127.0.0.1:8080/ds_market/api/user/

	@GetMapping("findByIdx")
	public String findByIdx(@RequestParam(value = "user_idx") int user_idx, Model model) {

		User result = userService.findByIdx(user_idx);

		if (result == null) {
			// 없음
			return "검색되는 회원이 없음.";
		} else {
			// 있음
			model.addAttribute("user", result);
			return "검색되는 회원 존재.";
		}

	}

	@GetMapping("getPoint")
	public String getPoint(@RequestParam(value = "user_idx") int user_idx) {

		// getRandomPoint 로 호출
		int point = getRandomPoint(50000);

		User user = new User();
		user.setUser_idx(user_idx);
		user.setPoint(point);

		userService.updatePoint(user);

		return "ok";
	}

	int getRandomPoint(int max) {

		Random random = new Random();
		int min = 1000;

		// 값을 정할수가 없어서 매게변수
//		int max = 5000;

		// 1000단위로 랜덤 값 생성
		int randomPoint = ((random.nextInt(max - min) / 1000 + 1) * 1000) + min;

		return randomPoint;

	}

	// 회원가입
	@PostMapping("create")
	public String create(@RequestParam(value = "id") String id, @RequestParam(value = "pw") String pw,
			@RequestParam(value = "nick") String nick, @RequestParam(value = "address") String address) {

		// 아이디 유효성 검사
		User ul1 = userService.findById(id);
		if (ul1 != null) {
			return "동일한 id";
		}

		// 닉네임 유효성 검사
		User ul2 = userService.findByNick(nick);
		if (ul2 != null) {
			return "동일한 nick";
		}

		User user = new User();
		user.setId(id);
		user.setPw(pw);
		user.setNick(nick);
		user.setAddress(address);

		Random random = new Random();

		// 포인트
		user.setPoint(1000);
		System.out.println((4000) / 1000 * 1);
		System.out.println((random.nextInt(50000 - 10000) / 1000 + 1) * 1000);

		// 코드
		user.setUser_code(RandomStringUtils.randomAlphanumeric(10));

		userService.save(user);

		return "ok";

	}

	// http://127.0.0.1:8080/ds_market/api/user/findByAll
	// 유저 DB 데이터 list 요청 & 실행
	@GetMapping("findByAll")
	public List<User> findByAll() {

		return userService.findByAll();
	}

	// JSP 실행
	@GetMapping("home")

	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String home() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "ok";
	}

}
