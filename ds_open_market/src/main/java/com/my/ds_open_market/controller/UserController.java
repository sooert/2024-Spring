package com.my.ds_open_market.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.ds_open_market.entity.User;
import com.my.ds_open_market.service.UserService;

@RestController
@RequestMapping(value = "api/user")
public class UserController {

	@Autowired
	UserService userService;

	// 회원 목록 조회
	@GetMapping("list")
	public List<User> getUserList() {
		return userService.findByAll();
	}

	// 회원 상세 조회
	@GetMapping("detail")
	public User getUserDetail(@RequestParam String code) {
		return userService.findByCode(code);
	}

	// 회원 포인트 업데이트
	@GetMapping("point")
	public int updatePoint(@RequestParam int user_idx, @RequestParam int point) {
		User user = new User();
		user.setUser_idx(user_idx);
		user.setM_point(point);
		return userService.updatePoint(user);
	}

	// 아이디로 회원 찾기
	@GetMapping("getById")
	public User getById(@RequestParam String id) {
		return userService.getById(id);
	}

	// 닉네임으로 회원 찾기
	@GetMapping("getByNick")
	public User getByNick(@RequestParam String nick) {
		return userService.getByNick(nick);
	}

	// 회원 생성
	@PostMapping("create")
	public String create(@RequestParam(value = "id") String id, @RequestParam(value = "img_url") String img_url,
			@RequestParam(value = "pw") String pw, @RequestParam(value = "nick") String nick,
			@RequestParam(value = "address") String address) {

		// 아이디 중복 검사
		if (userService.getById(id) != null) {
			return "동일한 id";
		}

		// 닉네임 중복 검사
		if (userService.getByNick(nick) != null) {
			return "동일한 nick";
		}

		User user = new User();
		user.setId(id);
		user.setPw(pw);
		user.setNick(nick);
		user.setAddress(address);
		user.setM_point(1000);
		user.setImg_url(img_url);

		String userCode;
		do {
			userCode = RandomStringUtils.randomAlphanumeric(10);
		} while (userService.findByCode(userCode) != null);

		user.setUser_code(userCode);
		userService.save(user);

		return "ok";
	}

	// 로그인
	@GetMapping("login")
	public User login(@RequestParam(value = "id", required = true) String id,
			@RequestParam(value = "pw", required = true) String pw, HttpSession session) {

		User user = new User();
		user.setId(id);
		user.setPw(pw);

		User result = userService.getByIdAndPw(user);
		if (result != null) {
			session.setAttribute("me", result);
		}
		return result;
	}

	// 마이페이지 정보 확인
	@GetMapping("getUserInfo")
	public User getUserInfo(@RequestParam String id) {
		return userService.getUserInfo(id);
	}

	// 로그아웃
	@PostMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "ok";
	}

	// 포인트 적립
	@GetMapping("getPoint")
	public String getPoint(@RequestParam(value = "user_idx") int user_idx) {
		int point = getRandomPoint(50000);

		User user = new User();
		user.setUser_idx(user_idx);
		user.setM_point(point);

		userService.updatePoint(user);

		return "ok";
	}

	// 랜덤 포인트 생성 (1000~max, 1000단위)
	private int getRandomPoint(int max) {
		Random random = new Random();
		int min = 1000;
		return ((random.nextInt(max - min) / 1000 + 1) * 1000) + min;
	}

	// 전체 회원 조회
	@PostMapping("findByAll")
	public List<User> findByAll() {
		return userService.findByAll();
	}

	@GetMapping("/api/user/current")
	public ResponseEntity<User> getCurrentUser(HttpSession session) {
		User user = (User) session.getAttribute("me");
		if (user == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		return ResponseEntity.ok(user);
	}

}
