package com.spring.upgrade.model.dao;

import java.util.List;

import com.spring.upgrade.model.dto.BoardDto;

public interface BoardDao {
	String NAMESPACE= "myboard.";
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(int myno);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int myno);

}
