package com.mvc.upgrade.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public MemberDto login(MemberDto dto) {
		MemberDto res= null;
		
		System.out.println(dto.getMemberid());
		System.out.println(dto.getMemberpw());
		
		try {
			res= sqlSession.selectOne(NAMESPACE+"login",dto);

		} catch (Exception e) {
			System.out.println("ERROR: login");
			e.printStackTrace();
		}
		
		return res;
	}


}
