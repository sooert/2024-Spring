package com.my.ds_front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontController {
	
	// 기본 홈페이지
	@GetMapping("f")
	public String front() {
		return "front";

	}
	
	// 기본 홈페이지
		@GetMapping("j")
		public String jumpit() {
			return "jumpit";

		}
		
		
		@GetMapping("d")
		public String deatil() {
			return "detail";

		}
		
		@GetMapping("l")
		public String login() {
			return "login";

		}
		
		@GetMapping("i")
		public String imsi() {
			return "imsi";

		}

		

}
