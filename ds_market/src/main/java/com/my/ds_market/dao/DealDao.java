package com.my.ds_market.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_market.entity.Deal;

@Repository
public class DealDao {
	@Autowired
	SqlSession s;

	// Mapper 에서 Deal DB 요청
	public int save(Deal deal) {
		return s.insert("DealMapper.save", deal);
	}

	public Deal findByIdxUserIdxAndItemIDx(Deal deal) {
		return s.selectOne("DealMapper,findByIdxUserIdxAndItemIDx", deal);
	}

}
