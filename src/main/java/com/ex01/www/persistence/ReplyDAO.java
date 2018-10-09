package com.ex01.www.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ex01.www.domain.ReplyVO;

@Repository
public class ReplyDAO {

	@Autowired
	private SqlSession session;
	
	public List<ReplyVO> list(Integer bno) throws Exception {
		return session.selectList("reply.list", bno);
	}
	
	public void create(ReplyVO vo) throws Exception {
		session.insert("reply.create", vo);
	}
	
	public void update(ReplyVO vo) throws Exception {
		session.update("reply.update", vo);
	}
	
	public void delete(Integer rno) throws Exception {
		session.update("reply.delete", rno);
	}
}
