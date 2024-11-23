package com.my.ds_market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_market.dao.UserDao;
import com.my.ds_market.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	// userDao 호출
	public int save(User user) {
		return userDao.save(user);
	}

	// 포인트 업데이트
	public int updatePoint(User user) {
		return userDao.updatePoint(user);
	}

	// 아이디 유효성 검사
	public User findById(String id) {
		return userDao.findById(id);
	}

	// 닉네임 검사
	public User findByNick(String nick) {
		return userDao.findByNick(nick);
	}

	// 포인트 찾기
	public int findByPoint(int point) {
		return userDao.findByPoint(point);
	}

	// idx 찾기
	public User findByIdx(int user_idx) {
		return userDao.findByIdx(user_idx);
	}

	// 유저 DB 데이터 list
	public List<User> findByAll() {
		return userDao.findByAll();
	}

	// datail
	public User findByCode(String user_code) {
		return userDao.findByCode(user_code);
	}

}
