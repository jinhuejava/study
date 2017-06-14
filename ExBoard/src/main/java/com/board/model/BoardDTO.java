package com.board.model;

import java.sql.Date;

public class BoardDTO {
	
	private int board_num;
	private String subject;
	private String contents;
	private String writer;
	private String pwd;
	private Date writedate;
	private int readnum;
	private int renum;
	private int renum2;
	private int lev;
	
	public BoardDTO(int board_num, String subject, String contents,
			String writer, String pwd, Date writedate, int readnum, int renum,
			int renum2, int lev) {
		super();
		this.board_num = board_num;
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
		this.pwd = pwd;
		this.writedate = writedate;
		this.readnum = readnum;
		this.renum = renum;
		this.renum2 = renum2;
		this.lev = lev;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}

	public int getReadnum() {
		return readnum;
	}

	public void setReadnum(int readnum) {
		this.readnum = readnum;
	}

	public int getRenum() {
		return renum;
	}

	public void setRenum(int renum) {
		this.renum = renum;
	}

	public int getRenum2() {
		return renum2;
	}

	public void setRenum2(int renum2) {
		this.renum2 = renum2;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}
	
}
