package com.board.model;

import org.mybatis.spring.SqlSessionTemplate;

public class BoardDAOImple implements BoardDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public BoardDAOImple(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

}
