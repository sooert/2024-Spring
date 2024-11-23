package com.my.ds_backand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.ds_backand.entity.User1;

// 메타 데이터
@Controller
public class imsi {

	// java + @ = 메뉴얼

	// 주소창은 get 으로 서버를 셋팅되어 있음 <기본으로 사용>
	// @GetMapping("") / DB 조회할때 사용 / jsp 사이트 이동할때 사용

	// 보안성, 요구사항, 다양한 형태의 데이터들을 받을 떄, 조작할 떄 사용
	// @PostMapping("")

	// 응답용도 확인할때 사용(사이트 사용할때도 포함)
	// 단, 데이터나 아무타입 가능
	// @ResponseBody
	// & : and (ex. http://127.0.0.1:8081/ds_backand/detailUser?user_id)에 사용

	// 산술 연산자
	// + : 덧셈
	// - : 뺼셈
	// * : 곱센
	// / : 나눗셈
	// % : 나머지

	// F2 누르면 이름 변경 가능

	// 랜덤 문자
//	@GetMapping("random")
//	@ResponseBody
//	public String random(
//			// 데이터 value 로 count 지정 | 숫자 int 인 len
//			@RequestParam(value = "count") int len) {
//
//		// 랜덤 문자 생성 요청
//		String str = RandomStringUtils.randomAlphanumeric(10);
//
//		return str;
//
//		// if 조건문
//		// 렌이 1보다 작을 경우 must over 0 으로 처리
//		if (len < 1) {
//
//			return "must over 0";
//		}
//		// 렌이 2보다 작거나 같을 경우 same 으로 처리
//		if (len <= 2) {
//			return "same";
//		}
//		// 렌이 11보다 작으면 호출
//		if (len <= 11) {
//			String str = RandomStringUtils.randomAlphanumeric(len);
//			return str;
//
//		}
//		// 홀수 일때
//		// 렌이 2로 나눠서 나머지 수가 1와 같을때
//		if (len % 2 == 1) {
//
//			return "must be even number";
//		}
//
//		// 렌이 11보다 크다면 too long 으로 처리
//		else {
//			return "too long";
//
//		}

//		// 랜덤 문자 생성 요청
//		String str = RandomStringUtils.randomAlphanumeric(20);
//
//		return str;

//	}

	@GetMapping("detailUser")
	public String detailUser(@RequestParam(value = "user_id") String id,

			// 페이지에 데이터를 넣을려면 Model 를 사용 해야함
			Model model) {

		// DB 데이터 생성
		String idFromDB = "coding1234";
		String pwFromDB = "1234";
		String nickFromDB = "닉네임";
		String addressFromDB = "부산 진구";

		// User.java 에서 메소드 얻어오기
		User1 user1 = new User1();

		user1.setId(idFromDB);
		user1.setPw(pwFromDB);
		user1.setNick(nickFromDB);
		user1.setAddress(addressFromDB);

		// 값이 업거나 비어있을때 null 로 표기

		// User 를 jsp 로 보내기
		model.addAttribute("User", user1);

		// class 불러오기
//		User a = new User(idFromDB, pwFromDB, nickFromDB, addressFromDB);
//		model.addAttribute("user", a);

		// 페이지에 데이터 보내기
		// model 를 사용해서 addAttribute 를 사용해서 필요한 부분을 넣기
//		model.addAttribute("user", name);
//		model.addAttribute("pw", pwFromDB);
//		model.addAttribute("nick", nickFromDB);
//		model.addAttribute("address", addressFromDB);
		// detail-user 로 리턴
		return "detail-user";
	}

	// 회원가입 DB 사이트에 사용
	@ResponseBody

	@PostMapping("saveUser")
	// defaultValue 를 사용하면 임시로 올릴수 있음
	public String saverUser(@RequestParam(value = "uid") String id, @RequestParam(value = "upw") String pw) {

		// DB에 회원 정보 추가
		System.out.println(id);
		System.out.println(pw);

		return "OK";

	}

	// JSP 실행
	@GetMapping("home")
	@ResponseBody

	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String home() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "home";
	}

	// JSP 실행
	@GetMapping("front")
	@ResponseBody
	// String 뷰( jsp ) 리턴 ( jsp 파일명)
	public String front() {

		// return 을 해야 다기 front 로 신호가 돌아감
		return "front";
	}

}
