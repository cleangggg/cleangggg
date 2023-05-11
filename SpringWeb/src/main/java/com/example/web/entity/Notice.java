package com.example.web.entity;

import java.util.Date;

public class Notice {

	private int id;
	private String title;
	private String content;
	private Date regdaate;
	private int hit;
	private boolean pub;
	private int memberId;	
	public Notice() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdaate() {
		return regdaate;
	}

	public void setRegdaate(Date regdaate) {
		this.regdaate = regdaate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public boolean isPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Notice(int id, String title, String content, Date regdaate, int hit, boolean pub, int memberId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regdaate = regdaate;
		this.hit = hit;
		this.pub = pub;
		this.memberId = memberId;
	}
	
	
	
	
	
}
