package com.my.ds_open_market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_open_market.dao.ItemDao;
import com.my.ds_open_market.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;

	// 상품 추가
	public int save(Item item) {
		return itemDao.save(item);
	}

	// 상품 찾기
	public Item findByCode(String item_code) {
		return itemDao.findByCode(item_code);
	}

	// 유저 아이디 찾기
	public Item findByIdx(Item item) {
		return itemDao.findByIdx(item);
	}

	// 모든 상품 조회
	public List<Item> findAll() {
		return itemDao.findAll();
	}
}
