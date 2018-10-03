package com.ex01.www.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ex01.www.domain.BoardVO;
import com.ex01.www.domain.Criteria;
import com.ex01.www.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/root-context.xml"})
public class BoardDAOTest {
	
	@Autowired
	private BoardDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test @Ignore
	public void testCreate() throws Exception {
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("user00");
		dao.create(board);
	}

	@Test @Ignore
	public void testRead() throws Exception {
		logger.info(dao.read(3).toString());
	}
	
	@Test @Ignore
	public void testUpdate() throws Exception {
		BoardVO board = new BoardVO();
		board.setBno(2);
		board.setTitle("수정된 글입니다.");
		board.setContent("수정 테스트");
	}
	
	@Test @Ignore
	public void testDelete() throws Exception {
	}
	
	@Test @Ignore
	public void testListPage() throws Exception {
		int page = 2;
		
		List<BoardVO> list = dao.listPage(page);
		
		for(BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + " : " + boardVO.getTitle());
		}
	}
	
	@Test
	public void testListCriteria() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(10);
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + " : " + boardVO.getTitle());
		}
	}
}
