package com.my.ds_backand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_backand.dao.UserDao;
import com.my.ds_backand.entity.User;

//Controller 의 코드가 길어지면 관리가 힘듬.
// 비지니스 로직을 service 에 구성하고 Controller 에서 호출하여 사용
// Service 에서 여러 Dao 함수들을 호출
// @Service 어노테이션 사용

@Service
public class UserService {

	@Autowired
	// Dao 에서 user 데이터 호출
	UserDao userDao;

	// Dao > idx 를 리턴
	public User findByIdx(int idx) {
		return userDao.findByIdx(idx);
	}

	// Dao > user 를 리턴
	public int create(User user) {
		return userDao.create(user);
	}

	public int delete(int user_idx) {
		return userDao.delete(user_idx);
	}

	public int updatePw(User u) {
		return userDao.updatePw(u);
	}

	public List<User> all() {
		return userDao.findAll();
	}

	public User findById(String value) {
		return userDao.findById(value);
	}

	public User findByNick(String value) {
		return userDao.findByNick(value);
	}

}
