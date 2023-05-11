package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.dao.NoticeDao;
import com.example.web.entity.Notice;



@Service
public class NoticeServiceImp implements NoticeService{
	@Autowired(required = false)
	private NoticeDao	 noticeDao;
	
	@Override
	public List<Notice> getList() {

		List<Notice> list = noticeDao.getList();

		return list;
	}

 
	@Override
	public Notice get(int id) {

		Notice notice =noticeDao.get(id); 
		 

		return notice;
	}

}
