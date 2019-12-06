package com.liuchongyang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuchongyang.domain.Confition;
import com.liuchongyang.domain.Goods;

public interface GoodsDao {

	List<Goods> getGoodsList(Confition con);

	int insertGoodsByTxt(List<Goods> list);
}
