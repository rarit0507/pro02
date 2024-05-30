package com.starbucks.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starbucks.biz.BoardBiz;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardBiz boardService;
	
	@RequestMapping("list.do")
	public String getBoardList(Model model) {
		model.addAttribute("list", boardService.getBoardList());
		return "board/list";
	}
	
	@RequestMapping("detail.do")
	public String getBoard(@RequestParam("bno") int bno, Model model) {
		model.addAttribute("board", boardService.getBoard(bno));
		return "board/get";
	}


}