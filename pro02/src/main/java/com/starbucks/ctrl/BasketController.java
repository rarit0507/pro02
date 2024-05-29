package com.starbucks.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starbucks.biz.BasketBiz;

@Controller
@RequestMapping("/basket/")
public class BasketController {

	@Autowired
	private BasketBiz basketService;
	

}
