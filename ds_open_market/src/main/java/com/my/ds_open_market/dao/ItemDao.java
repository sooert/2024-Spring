package com.my.ds_open_market.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_open_market.entity.Item;

@Repository
public class ItemDao {
	@Autowired
	SqlSession s;

	// 상품 추가
	public int save(Item item) {
		return s.insert("ItemMapper.save", item);
	}

	// 상품 찾기
	public Item findByCode(String item_code) {
		return s.selectOne("ItemMapper.findByCode", item_code);
	}

	public Item findByIdx(Item item) {
		return s.selectOne("ItemMapper.findByIdx", item);
	}

	// 모든 상품 조회
	public List<Item> findAll() {
		return s.selectList("ItemMapper.findAll");
	}

}
