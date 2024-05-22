package com.starbucks.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starbucks.biz.BoardBiz;
import com.starbucks.domain.Board;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardBiz boardService;
	
	//총 게시글 수 출력
	@GetMapping("totalCount.do")
    public String getTotalCount(Model model) {
        int totalCount = boardService.getTotalCount();
        model.addAttribute("totalCount", totalCount);
        return "board/totalCount";
    }
	
	//목록 출력
	@GetMapping("boardList.do")
	public String getBoardList(Model model) {
		List<Board> list = boardService.getBoardList();
		model.addAttribute("list",list);
		return "board/boardList";
	}
	
	//상세보기
	@GetMapping("getBoard.do")
	public String getBoard(HttpServletRequest request, Model model) {
		int bno = Integer.parseInt(request.getParameter("bno")); 	// URL 매개변수 'bno'를 정수로 변환
		
		//조회수 증가
		boardService.vcntCount(bno);
		
		//게시글 정보 가져오기
		Board board = boardService.getBoard(bno);
		
		if(board == null) {
			model.addAttribute("errMsg","해당 게시글을 찾을 수 없습니다.");
			return "errorPage";
		}
		model.addAttribute("board",board);
		
		return "board/getBoard.do";
	}
	
	//글쓰기 페이지
	@PostMapping("insBoard.do")
	public String insBoard(Model model) {
		return "board/insBoard";
	}
	
	//글 등록
	@PostMapping("insBoardPro.do")
	public String insBoardPro(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");	//폼에서 들어온 제목
		String content = request.getParameter("content");	//" 내용
		
		Board board = new Board();	//빈 객체를 생성한 후
		board.setTitle(title);		//폼에서 들어온 제목 대입
		board.setContent(content);	//폼에서 들어온 내용 대입
		
		boardService.insBoard(board);	//서비스에 객체 추가를 요청
		
		return "redirect:getBoard.do?bno=" + board.getBno();
	}
	
	//게시글 수정 페이지
	@GetMapping("upBoard.do")
	public String upBoard(HttpServletRequest request, Model model) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = boardService.getBoard(bno);
		model.addAttribute("board",board);
		return "board/upBoard";
	}
	
	@PostMapping("upBoardPro.do")
	public String upBoardPro(HttpServletRequest request, Model model) {
	    int bno = Integer.parseInt(request.getParameter("bno"));
	    String title = request.getParameter("title");
	    String content = request.getParameter("content");
	    
	    // 새로운 정보로 Board 객체 생성
	    Board updatedBoard = new Board();
	    updatedBoard.setBno(bno);
	    updatedBoard.setTitle(title);
	    updatedBoard.setContent(content);
	    
	    // DB에 업데이트 수행
	    boardService.upBoard(updatedBoard);
	    
	    // 업데이트 후 게시글 상세 페이지로 리다이렉트
	    return "redirect:getBoard.do?bno=" + bno;
	}
	
	@GetMapping("delBoard.do")
	public String delBoard(HttpServletRequest request,Model model) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = new Board();
		board.setBno(bno);
		boardService.delBoard(board);
		model.addAttribute("board",board);
		return "redirect:boardList.do";
	}
	
	/*
	<li><a href="${path2 }/board/boardList.do">테스트 목록</a></li>
	<li><a href="${path2 }/board/getBoard.do?bno=1">테스트1</a></li>
	<li><a href="${path2 }/board/upBoard.do?bno=1">테스트1 수정</a></li>
	<li><a href="${path2 }/board/insBoard.do">테스트1 추가</a></li>
	<li><a href="${path2 }/board/delBoard.do?bno=1">테스트1 삭제</a></li>
	*/
}
