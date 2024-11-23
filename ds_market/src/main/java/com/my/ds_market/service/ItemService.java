package com.my.ds_market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_market.dao.ItemDao;
import com.my.ds_market.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;

	// item Dao 에서 호출
	public int save(Item item) {
		return itemDao.save(item);
	}

	public Item findByIdx(int item_idx) {
		return itemDao.findByIdx(item_idx);
	}

	// 물건 판매 DB 데이터 list
	public List<Item> findByAll() {
		return itemDao.findByAll();
	}

}
