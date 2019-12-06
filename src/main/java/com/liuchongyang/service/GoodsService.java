package com.liuchongyang.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liuchongyang.domain.Confition;
import com.liuchongyang.domain.Goods;

public interface GoodsService {

	PageInfo<Goods> getGoodsList(Confition con, Integer pageNum);

	int insertGoodsByTxt(List<Goods> list);
}
