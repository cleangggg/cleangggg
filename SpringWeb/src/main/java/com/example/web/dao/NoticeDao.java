package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.web.entity.Notice;


@Mapper
public interface NoticeDao {
	@Select("select * from notice")
	List<Notice> getList();
	
	Notice get(int id);
	
}
