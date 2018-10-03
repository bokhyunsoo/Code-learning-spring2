package com.ex01.www.service;

import java.util.List;
import java.util.Map;

import com.ex01.www.domain.BoardVO;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(Map map) throws Exception;
	
	public void remove(Map map) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
}
