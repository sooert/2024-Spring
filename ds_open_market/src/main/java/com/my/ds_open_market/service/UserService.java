package com.my.ds_open_market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_open_market.dao.UserDao;
import com.my.ds_open_market.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	// 회원 추가
	public int save(User user) {
		return userDao.save(user);
	}

	// 유저 검색
	public User getByIdAndPw(User user) {
		return userDao.getByIdAndPw(user);
	}

	// 아이디 찾기
	public User getById(String id) {
		return userDao.getById(id);
	}

	// 닉네임 찾기
	public User getByNick(String nick) {
		return userDao.getByNick(nick);
	}

	// 마이페이지 정보 확인
	public User getUserInfo(String id) {
		return userDao.getUserInfo(id);
	}

	// 로그아웃
	public int logout(User user) {
		return userDao.logout(user);
	}

	// 포인트 업데이트
	public int updatePoint(User user) {
		return userDao.updatePoint(user);
	}

	// 전체 회원 목록 조회
	public List<User> findByAll() {
		return userDao.findByAll();
	}

	// 회원코드로 회원 찾기
	public User findByCode(String code) {
		return userDao.findByCode(code);
	}

	// 유저 아이디 찾기
	public User findById(int user_idx) {
		return userDao.findById(user_idx);
	}

}
