package com.my.write.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.write.entity.Board;
import com.my.write.entity.User;
import com.my.write.service.BoardService;
import com.my.write.service.UserService;

@RestController
@RequestMapping(value = "api/board")
public class BoardController {

	@Autowired
	BoardService boardService;

	@Autowired
	UserService userService;

	// 게시글 추가
	@PostMapping("create")
	public String create(@RequestParam(value = "name") String name,
			@RequestParam(value = "content") String content, @RequestParam(value = "category") String category,
			HttpSession session) {
		
		// 로그인 여부 확인
		User me = (User) session.getAttribute("me");
		if (me == null) {
			return "로그인이 필요합니다";
		}

		// 닉네임 찾기
		String user_nick = me.getNick();

		// 게시글 생성
		Board board = new Board();
		board.setUser_nick(user_nick);
		board.setName(name);
		board.setContent(content);
		board.setCategory(category);

		boardService.save(board);

		return "ok";
	}

	// 유저 찾기
	@PostMapping("findById")
	public Board findById(@RequestParam(value = "user_id") String user_id) {
		return boardService.findById(user_id);
	}

	// 닉네임 찾기
	@PostMapping("findByNick")
	public Board findByNick(@RequestParam(value = "nick") String nick) {
		return boardService.findByNick(nick);
	}

	// 게시글 찾기
	@PostMapping("findByIdx")
	public Board findByIdx(@RequestParam(value = "board_idx") int board_idx) {
		return boardService.findByIdx(board_idx);
	}

	// 게시글 목록 조회
	@GetMapping("list")
	public List<Board> getBoardList() {
		try {
			List<Board> boards = boardService.findAll();
			System.out.println("조회된 게시글 수: " + boards.size());
			if (boards.isEmpty()) {
				System.out.println("게시글이 없습니다.");
			} else {
				System.out.println("첫 번째 게시글: " + boards.get(0).toString());
			}
			return boards;
		} catch (Exception e) {
			System.err.println("게시글 조회 중 오류 발생: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	// 전체 게시글 조회
	@GetMapping("findAll")
	public List<Board> findAll() {
		return boardService.findAll();
	}

	// 게시글 수정
	@PostMapping("update")
	public String update(@RequestParam(value = "board_idx") int board_idx,
			@RequestParam(value = "name") String name, @RequestParam(value = "content") String content,
			@RequestParam(value = "category") String category, HttpSession session) {

		User me = (User) session.getAttribute("me");
		if (me == null) {
			return "로그인이 필요합니다";
		}
		
		String user_nick = me.getNick();

		Board board = new Board();
		board.setBoard_idx(board_idx);
		board.setName(name);
		board.setContent(content);
		board.setCategory(category);
		board.setUser_nick(user_nick);
		boardService.update(board);		

		return "ok";
	}

	// 게시글 삭제
	@PostMapping("delete")
	public String delete(@RequestParam(value = "board_idx") int board_idx) {
		boardService.delete(board_idx);
		return "ok";
	}

	// 게시글 좋아요 추가
	@PostMapping("like")
	public String like(@RequestParam(value = "board_idx") int board_idx, HttpSession session) {
		User me = (User) session.getAttribute("me");
		if (me == null) {
			return "로그인이 필요합니다";
		}
		
		String user_nick = me.getNick();
		boardService.addLike(board_idx, user_nick);
		return "ok";
	}

	// 게시글 좋아요 삭제
	@PostMapping("unlike")
	public String unlike(@RequestParam(value = "board_idx") int board_idx) {
		boardService.deleteLike(board_idx);
		return "ok";
	}
}
