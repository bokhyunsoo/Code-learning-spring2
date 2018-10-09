package com.ex01.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex01.www.domain.ReplyVO;
import com.ex01.www.persistence.ReplyDAOImpl;

@Service
public class ReplyService {
	
	@Autowired
	private ReplyDAOImpl dao;
	
	public void create(ReplyVO vo) throws Exception {
		dao.create(vo);
	}
	
	public List<ReplyVO> list(Integer bno) throws Exception {
		return dao.list(bno);
	}
	
	public void update(ReplyVO vo) throws Exception {
		dao.update(vo);
	}
	
	public void delete(int rno) throws Exception {
		dao.delete(rno);
	}
}
