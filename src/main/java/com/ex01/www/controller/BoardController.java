package com.ex01.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ex01.www.domain.BoardVO;
import com.ex01.www.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value="register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		logger.info("register get ......");
	}
	
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, Model model) throws Exception {
		logger.info("register post ......");
		logger.info(board.toString());
		service.regist(board);
		model.addAttribute("result", "success");
		
		return "board/success";
	}
}
