package com.example.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web.entity.Notice;
import com.example.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list") // list,detail,edit,reg
	public String list(Model model) {

		
		List<Notice> list = service.getList();
		System.out.println(list);
		model.addAttribute("list", list);
		return "customer.notice.list";

	}

	@RequestMapping("detail") // list,detail,edit,reg
	public String detail() {

		
		
		return "customer.notice.detail";
	}

}
