package com.my.ds_open_market.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_open_market.entity.User;

@Repository
public class UserDao {

	@Autowired
	SqlSession s;

	// 회원 가입
	public int save(User user) {
		return s.insert("UserMapper.save", user);
	}

	// 로그인 - 아이디/비밀번호로 회원 조회
	public User getByIdAndPw(User user) {
		return s.selectOne("UserMapper.getByIdAndPw", user);
	}

	// 아이디로 회원 조회 
	public User getById(String id) {
		return s.selectOne("UserMapper.getById", id);
	}

	// 닉네임으로 회원 조회
	public User getByNick(String nick) {
		return s.selectOne("UserMapper.getByNick", nick);
	}

	// 마이페이지 회원 정보 조회
	public User getUserInfo(String id) {
		return s.selectOne("UserMapper.getUserInfo", id);
	}

	// 로그아웃 처리
	public int logout(User user) {
		return s.update("UserMapper.logout", user);
	}

	// 회원 포인트 업데이트
	public int updatePoint(User user) {
		return s.update("UserMapper.updatePoint", user);
	}

	// 전체 회원 목록 조회
	public List<User> findByAll() {
		return s.selectList("UserMapper.findByAll");
	}

	// 회원 코드로 회원 조회
	public User findByCode(String code) {
		return s.selectOne("UserMapper.findByCode", code);
	}

	// 유저 아이디 찾기
	public User findById(int user_idx) {
		return s.selectOne("UserMapper.findById", user_idx);
	}

}
