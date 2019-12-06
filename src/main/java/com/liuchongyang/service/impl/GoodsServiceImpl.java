package com.liuchongyang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuchongyang.dao.GoodsDao;
import com.liuchongyang.domain.Confition;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao dao;
	
	@Override
	public PageInfo<Goods> getGoodsList(Confition con, Integer pageNum) {
		PageHelper.startPage(pageNum, 10);
		
		List<Goods> list = dao.getGoodsList(con);
		
		PageInfo<Goods> info = new PageInfo<Goods>(list);
		
		return info;
	}

	@Override
	public int insertGoodsByTxt(List<Goods> list) {
		return dao.insertGoodsByTxt(list);
	}

}
