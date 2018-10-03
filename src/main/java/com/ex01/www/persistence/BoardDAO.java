package com.ex01.www.persistence;

import java.util.List;
import java.util.Map;

import com.ex01.www.domain.BoardVO;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(Map map) throws Exception;
	
	public void delete(Map map) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
}
