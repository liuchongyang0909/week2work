package com.liuchongyang.service.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuchongyang.common.utils.StreamUtil;
import com.liuchongyang.common.utils.StringUtil;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.service.GoodsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {

	@Autowired
	private GoodsService service;
	
	@Test
	public void testGetGoodsList() {
	}

	@Test
	public void testInsertGoodsByTxt() throws IOException {
		List<Goods> list = new ArrayList<Goods>();
		
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/goods.txt"));
		
		for (String string : read) {
			System.out.println(string);
			Goods goods = new Goods();
			String[] s = string.split("==");
			boolean b = StringUtil.isNumber(s[0]);
			
			goods.setGid(Integer.parseInt(s[0]));
			goods.setGname(s[1]);
			
			if(StringUtil.hasText(s[2])) {
				String price = s[2].substring(1);
				boolean c = StringUtil.isNumber(price);
				
				if(c) {
					goods.setPrice(Double.valueOf(price));
				}
			}
			
			if(s.length == 4) {
				if(StringUtil.hasText(s[3])) {
					String sales = s[3].substring(0, s[3].lastIndexOf("%"));
					
					boolean d = StringUtil.isNumber(sales);
					
					if(d) {
						goods.setSales(Integer.parseInt(sales));
					} else {
						goods.setSales(0);
					}
				}
			} else {
				goods.setSales(0);
			}
			
			list.add(goods);
		}
		
		service.insertGoodsByTxt(list);
	}

}
