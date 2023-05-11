package com.myBatis.myService.controller;

import com.myBatis.myService.dao.DeptDao;
import com.myBatis.myService.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptDao deptDao;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptDao.selectList();
        System.out.println(list);
        return list;
    }
}