package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.dao.NoticeDao;
import com.example.web.entity.Notice;

public class NoticeServiceImp implements NoticeService{
	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getList() {

		List<Notice> list = noticeDao.getList();
		return null;
	}

	@Override
	public Notice get(int i) {
		
		Notice notice =noticeDao.get(id); 
		
		return null;
	}

}
