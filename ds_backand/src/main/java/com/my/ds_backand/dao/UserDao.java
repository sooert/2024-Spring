package com.my.ds_backand.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ds_backand.entity.User;

//@Repository 어노테이션 사용
@Repository
public class UserDao {

	// Mapper 함수를 호출하는 부분
	// autowired 자동 처리
	@Autowired
	SqlSession s;

	// 1. void
	// 2. 코드
	// 3. 매게변수 처리
	// 4. 리턴

	// UserMapper 에서 user 클래스로 호출
	public User findByIdx(int userIdx) {
		return s.selectOne("UserMapper.findByIdx", userIdx);
	}

	// userMapper 에서 insert 된 id 키 값을 가져와서 호풀
	public int create(User user) {
		return s.insert("UserMapper.save", user); // {mapper 의 namespace}.{id} 를 이용해서 return 으로 호풀

	}

	public List<User> findAll() {

		return s.selectList("UserMapper.findAll");
	}

	public User findById(String id) {
		return s.selectOne("UserMapper.findById", id);
	}

	public User findByNick(String nick) {
		return s.selectOne("UserMapper.findByNick", nick);
	}

	public int delete(int user_idx) {
		return s.delete("UserMapper.delete", user_idx);
	}

	public int updatePw(User user) {
		return s.update("UserMapper.updatePw", user);
	}

}
