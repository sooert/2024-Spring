package com.my.ds_market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_market.dao.DealDao;
import com.my.ds_market.entity.Deal;

@Service
public class DealService {

	@Autowired
	DealDao dealDao;

	// Dao에서 Deal 요청
	public int save(Deal deal) {
		return dealDao.save(deal);
	}

	public Deal findByIdxUserIdxAndItemIDx(Deal deal) {
		return dealDao.findByIdxUserIdxAndItemIDx(deal);
	}

}
