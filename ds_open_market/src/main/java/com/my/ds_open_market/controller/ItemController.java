package com.my.ds_open_market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.ds_open_market.entity.Item;
import com.my.ds_open_market.entity.User;
import com.my.ds_open_market.service.ItemService;
import com.my.ds_open_market.service.UserService;

@RestController
@RequestMapping("api/item")
public class ItemController {

	@Autowired
	ItemService itemService;

	@Autowired
	UserService userService;

	// 상품 추가
	@PostMapping("create")
	public ResponseEntity<String> create(@RequestParam(value = "name") String name,
			@RequestParam(value = "content") String content, @RequestParam(value = "item_img_url") String item_img_url,
			@RequestParam(value = "item_code") int item_code, @RequestParam(value = "price") int price,
			@RequestParam(value = "discount_rate") int discount_rate, @RequestParam(value = "m_rate") int m_rate,
			HttpSession session) {

		User me = (User) session.getAttribute("me");
		if (me == null) {
			return ResponseEntity.badRequest().body("로그인이 필요합니다");
		}

		int user_idx = me.getUser_idx();

		Item item = new Item();
		item.setUser_idx(user_idx);
		item.setName(name);
		item.setContent(content);
		item.setItem_img_url(item_img_url);
		item.setItem_code(item_code);
		item.setPrice(price);
		item.setDiscount_rate(discount_rate);
		item.setM_rate(m_rate);

		itemService.save(item);

		return ResponseEntity.ok("ok");
	}

	@PostMapping("findByIdx")
	public Item findById(@RequestParam(value = "user_idx") int user_idx) {

		// 먼저 사용자가 존재하는지 확인
		User user = userService.findById(user_idx);
		if (user == null) {
			return null; // 또는 예외 처리를 할 수 있습니다
		}

		Item item = new Item();
		item.setUser_idx(user_idx);

		return itemService.findByIdx(item);
	}

	// 상품 목록 조회
	@GetMapping("list")
	public ResponseEntity<List<Item>> getItemList() {
		List<Item> items = itemService.findAll();
		return ResponseEntity.ok(items);
	}

}
