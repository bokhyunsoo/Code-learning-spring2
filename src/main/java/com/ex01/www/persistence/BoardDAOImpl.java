package com.ex01.www.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ex01.www.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;
	
	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert("board.create", vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne("board.read", bno);
	}

	@Override
	public void update(Map map) throws Exception {
		session.update("board.update", map);
	}

	@Override
	public void delete(Map map) throws Exception {
		session.delete("board.delete", map);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList("board.listAll");
	}
	
}
