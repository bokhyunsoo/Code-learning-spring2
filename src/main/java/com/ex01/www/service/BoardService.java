package com.ex01.www.service;

import java.util.List;
import java.util.Map;

import com.ex01.www.domain.BoardVO;
import com.ex01.www.domain.Criteria;
import com.ex01.www.domain.SearchCriteria;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(Map map) throws Exception;
	
	public void remove(Map map) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int listCountCriteria(Criteria cri) throws Exception;
	
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
