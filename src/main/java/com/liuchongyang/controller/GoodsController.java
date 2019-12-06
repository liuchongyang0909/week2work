package com.liuchongyang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.liuchongyang.domain.Confition;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m, Confition con, @RequestParam(defaultValue = "1")Integer pageNum) {
		PageInfo<Goods> info = service.getGoodsList(con, pageNum);
		
		m.addAttribute("info", info);
		m.addAttribute("con", con);
		
		return "list";
	}

}
