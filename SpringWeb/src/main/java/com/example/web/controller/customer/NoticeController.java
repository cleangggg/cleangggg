package com.example.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

	@RequestMapping("/customer/notice/list") // list,detail,edit,reg
	public String list(Model model) {
		model.addAttribute("test","hello~~" );
//		return "customer/notice/list";//ResourceViewResolver
		return "customer.notice.list";//TilesViewResolver
	}

	@RequestMapping("/customer/notice/detail") // list,detail,edit,reg
	public String detail() {

		
		
		return "customer.notice.detail";
	}

}
