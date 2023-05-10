package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.web.entity.Notice;

public class NoticeDao {

	@Select("select *from notice")
	List<Notice> getList();
	
	Notice get(int id);
	
}
