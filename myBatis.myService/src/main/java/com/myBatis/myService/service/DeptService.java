package com.myBatis.myService.service;
import com.myBatis.myService.model.Dept;


import java.util.List;


public interface DeptService {
    public List<Dept> selectList();
}