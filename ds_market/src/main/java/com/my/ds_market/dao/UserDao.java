package com.my.ds_market.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_market.entity.User;

@Repository
public class UserDao {

	@Autowired
	SqlSession s;

	// UserMapper 에서 insert 된 id 키 값 호출
	public int save(User user) {
		return s.insert("UserMapper.save", user);
	}

	// 포인트 업데이트
	public int updatePoint(User user) {
		return s.update("UserMapper.updatePoint", user);
	}

	// 아이디
	public User findById(String id) {
		return s.selectOne("UserMapper.findById", id);
	}

	// UserMapper 에서 uesr 클래스로 호출
	// 닉네임
	public User findByNick(String nick) {
		return s.selectOne("UserMapper.findByNick", nick);
	}

	// 포인트
	public int findByPoint(int point) {
		return s.selectOne("UserMapper.findByPoint", point);
	}

	// 유저코드
	public User findByIdx(int user_idx) {
		return s.selectOne("UserMapper.findByIdx", user_idx);
	}

	// 유저 DB 데이터 list
	public List<User> findByAll() {
		return s.selectList("UserMapper.findByAll");
	}

	// DB 데이터 회원 정보로 datil
	public User findByCode(String code) {
		return s.selectOne("UserMapper.findByCode", code);
	}
}
