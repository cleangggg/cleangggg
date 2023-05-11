package com.myBatis.myService.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myBatis.myService.model.Dept;

import lombok.Getter;

@Mapper// mapping파일에 있는 sql을 인터페이스로 호출
public interface DeptDao {	
	public List<Dept> selectList();    
}