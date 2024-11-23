package com.my.ds_market.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_market.entity.Item;

@Repository
public class ItemDao {
	@Autowired
	SqlSession s;

	// mapper 에서 item 호출
	public int save(Item item) {
		return s.insert("ItemMapper.save", item);
	}

	// mapper 에서 item DB 호출
	public Item findByIdx(int item_idx) {
		return s.selectOne("ItemMapper.findByIdx", item_idx);
	}

	// 물건 판매 DB 데이터 list
	public List<Item> findByAll() {
		return s.selectList("ItemMapper.findByAll");
	}

}
