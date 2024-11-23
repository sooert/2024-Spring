package com.why.ds_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//ctrl + shift + o - 단축키

@Controller
public class HomeController {
	
	// 백엔드 코드
	// 기본 홈 페이지
	@GetMapping ("")
	public String home() {
		return "home";
		
	}
	// login_page
		@GetMapping ("lo")
		public String loginPage() {
			return "login_page";
		}
		
	// id_class page
		@GetMapping ("ic")
		public String ic() {
			return "id_class";
			
		}
		
	// layout page
		@GetMapping ("la")
		public String la() {
			return "layout";
			
		}
}
