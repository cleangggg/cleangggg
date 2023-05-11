package com.example.web.service;

import java.util.List;

import com.example.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList();

	Notice get(int id);

	
}
