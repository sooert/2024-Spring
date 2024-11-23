package com.my.ds_market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.ds_market.entity.Deal;
import com.my.ds_market.entity.Item;
import com.my.ds_market.entity.User;
import com.my.ds_market.service.DealService;
import com.my.ds_market.service.ItemService;
import com.my.ds_market.service.UserService;

// 모든 리턴 방식 포함
@RestController

// 주소에 같이 포함해서 검색
@RequestMapping("api/deal")
public class DealController {
	@Autowired
	DealService dealService;

	@Autowired
	ItemService itemService;

	@Autowired
	UserService userService;

	@PostMapping("pay")
	public String pay(@RequestParam(value = "buy_user_idx") int buy_user_idx,
			@RequestParam(value = "item_idx") int item_idx) {

//		// 예외처리
//		System.out.println("예외 처리");
//		// 문제 생겼을시 사용
//		try {
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage("예외처리");
//		}

		// 이미 거래를 유무 확인 findByIdxUserIdxAndItemIDx
		Deal deal1 = new Deal();
		deal1.setBuy_user_idx(buy_user_idx);
		deal1.setItem_idx(item_idx);
		Deal payedDeal = dealService.findByIdxUserIdxAndItemIDx(null);

		if (payedDeal != null) {
			return "payedDeal";
		}

		// 상품 가격과 회원 포인트 비교 return "no-point"
		Item item = itemService.findByIdx(item_idx);
		User user = userService.findByIdx(buy_user_idx);

		int price = item.getPrice();
		int point = user.getPoint();

		if (price > point) {
			return "no-point";
		}

		// ** 거래 시작 **

		// 포인트 차감 계산식
		User userWithPoint = new User();
		userWithPoint.setUser_idx(buy_user_idx);
		userWithPoint.setPoint((-1) * price);
		userService.updatePoint(userWithPoint);

		Deal deal = new Deal();

		deal.setBuy_user_idx(buy_user_idx);
		deal.setItem_idx(item_idx);

		dealService.save(deal);

		return "ok";
	}

}
