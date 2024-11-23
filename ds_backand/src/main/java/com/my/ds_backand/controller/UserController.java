package com.my.ds_backand.controller;

//@Controller
//@RequestMapping(value = "api/user")
//// http://127.0.0.1:8081/ds_backand/api/user/save?id=somgsatang&pw=1234&nick=솜사탕
//public class UserController {
//	// 전체 서버 관리
//
//	// 참고용도
//	// http://127.0.0.1:8081/ds_backand/api/user/findByIdx?user_idx=1
////	@GetMapping("findByIdx")
////	@ResponseBody
//	// object 전체 할당
////	public Object findByIdx(@RequestParam(value = "user_idx") int user_idx) {
////
////		User result = userService.findByIdx(user_idx);
////
////		if (result == null) {
////			// 회원 없을 경우
////			return "회원자 없음";
////		} else {
////			// 회원 있을 경우
////			return result;
////		}
////
////	}
//
//	@Autowired
//	UserService userService;
//
//	@GetMapping("findByIdx")
//	// Model 로 user DB 데이터 불러와서 검색
//	public String findByIdx(@RequestParam(value = "user_idx") int user_idx, Model model) {
//
//		User result = userService.findByIdx(user_idx);
//
//		if (result == null) {
//			// 회원 없을 경우
//			return "no-user";
//		} else {
//			// 회원 있을 경우
//			model.addAttribute("user", result);
//			return "detail-user";
//		}
//
//	}
//
//	@GetMapping("save")
//	@ResponseBody
//	public String save(@RequestParam(value = "id") String id, @RequestParam(value = "pw") String pw,
//			@RequestParam(value = "nick") String nick) {
//
////		// user 값 셋팅
////		User user = new User();
////		user.setId(id);
////		user.setPw(pw);
////		user.setNick(nick);
////
////		// user 값 호출 후 리턴
////		userService.create(user);
////
////		return "ok";
//
//		// 아이디 유효성 검사
//		User user1 = userService.findById(id);
//		User user2 = userService.findByNick(nick);
//
//		if (user1 != null && user2 != null) {
//			return "id,nick";
//		}
//
//		if (user1 != null) {
//			// 아이디로 가입된 회원이 존재
//			return "id";
//		}
//
//		// 닉네임 유효성 검사
//
//		if (user2 != null) {
//			// 닉네임으로 가입된 회원이 존재
//			return "nick";
//		}
//	}
//
//	@GetMapping("del")
//	@ResponseBody
//	public String del(@RequestParam(value = "user_idx") int user_idx) {
//		userService.delete(user_idx);
//		return "ok";
//	}
//
//	@GetMapping("changePw")
//	@ResponseBody
//	public String changePw(@RequestParam(value = "user_idx") int user_idx, @RequestParam(value = "new_pw") String pw,
//			@RequestParam(value = "now_pw") String nowpw) {
//
//		// 비밀번호 일치여부
//		User me = userService.findByIdx(user_idx);
//		if (me.getPw().equals(nowpw) == false) {
//			return "현재 비밀번호가 일치 하지 않습니다.";
//		}
//
//		User user = new User();
//		user.setUser_index(user_idx);
//		user.setPw(pw);
//
//		userService.updatePw(user);
//
//		return "ok";
//	}
//
//	@GetMapping("all")
//	@ResponseBody
//	public List<User> all() {
//
//		List<User> users = userService.all();
//
//		return users;
//	}
//
//	@GetMapping("findByIdx")
//	public String findByIdx(@RequestParam(value = "user_idx") int user_idx, Model model) {
//
//		User result = userService.findByIdx(user_idx);
//
//		if (result == null) {
//			// 없음
//			return "no-user";
//		} else {
//			// 있음
//			model.addAttribute("user", result);
//			return "detail-user";
//		}
//
//	}
//	
//	String code = RandomStringUtils.randomAlphanumeric(10);
//	
//	User user = new User();
//	user.setUser_code(code);
//	user.setId(id);
//	user.setPw(pw);
//	user.setNick(nick);
//	
//	userService.create(user);
//	
//	
//	return "ok";
//}
//
//}

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ds_backand.entity.User;
import com.my.ds_backand.service.UserService;

@Controller
@RequestMapping(value = "api/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("del")
	@ResponseBody
	public String del(@RequestParam(value = "user_idx") int user_idx) {
		userService.delete(user_idx);
		return "ok";
	}

	@GetMapping("changePw")
	@ResponseBody
	public String changePw(@RequestParam(value = "user_idx") int user_idx, @RequestParam(value = "new_pw") String pw,
			@RequestParam(value = "now_pw") String nowpw) {

		// 비밀번호 일치여부
		User me = userService.findByIdx(user_idx);
		if (me.getPw().equals(nowpw) == false) {
			return "현재 비밀번호가 일치 하지 않습니다.";
		}

		User user = new User();
		user.setUser_index(user_idx);
		user.setPw(pw);

		userService.updatePw(user);

		return "ok";
	}

	@GetMapping("all")
	@ResponseBody
	public List<User> all() {

		List<User> users = userService.all();

		return users;
	}

	@GetMapping("findByIdx")
	// Model 로 user DB 데이터 불러와서 검색
	public String findByIdx(@RequestParam(value = "user_idx") int user_idx, Model model) {

		User result = userService.findByIdx(user_idx);

		if (result == null) {
			// 회원 없을 경우
			return "no-user";
		} else {
			// 회원 있을 경우
			model.addAttribute("user", result);
			return "detail-user";
		}

	}

	@GetMapping("save")
	@ResponseBody
	public String save(@RequestParam(value = "id") String id, @RequestParam(value = "pw") String pw,
			@RequestParam(value = "nick") String nick) {

		// 아이디 유효성 검사
		User user1 = userService.findById(id);
		User user2 = userService.findByNick(nick);

		if (user1 != null && user2 != null) {
			return "id,nick";
		}

		if (user1 != null) {
			// 아이디로 가입된 회원이 존재
			return "id";
		}

		// 닉네임 유효성 검사

		if (user2 != null) {
			// 닉네임으로 가입된 회원이 존재
			return "nick";
		}

		String code = RandomStringUtils.randomAlphanumeric(10);

		User user = new User();
		user.setUser_code(code);
		user.setId(id);
		user.setPw(pw);
		user.setNick(nick);

		userService.create(user);

		return "ok";
	}

}
