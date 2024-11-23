package com.my.ds_market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.ds_market.entity.Item;
import com.my.ds_market.service.ItemService;

@RestController
@RequestMapping(value = "api/item")
public class ItemController {

	@Autowired
	// itemService 에서 내용 불러오기
	ItemService itemservice;

	// http://127.0.0.1:8081/ds_market/api/item/create?user_idx=1&price=140000&name=솜사탕&maker=달콤회사

	@PostMapping("create")
	public ResponseEntity<String> create(@RequestParam(value = "user_idx") int user_idx,
			@RequestParam(value = "name") String name, @RequestParam(value = "maker") String maker,
			@RequestParam(value = "price") int price) {

		// 메소드 가젹오기
		Item item = new Item();
		item.setUser_idx(user_idx);
		item.setName(name);
		item.setMaker(maker);
		item.setPrice(price);

		itemservice.save(item);

		// 응답용 : ResponseEntity 를 사용할려면 ResponseEntity<String> 추가로 문단략 해야함
		return ResponseEntity.ok("ok");
	}

	// http://127.0.0.1:8080/ds_market/api/item/findByAll
	// 물건 판매 DB 데이터 list 요청 & 실행
	@GetMapping("findByAll")
	public List<Item> findByAll() {

		return itemservice.findByAll();
	}

}
