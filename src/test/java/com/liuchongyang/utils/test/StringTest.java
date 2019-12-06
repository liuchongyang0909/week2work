package com.liuchongyang.utils.test;

import java.util.Calendar;

import org.junit.Test;

import com.liuchongyang.common.utils.DateUtils;
import com.liuchongyang.common.utils.StringUtil;

public class StringTest {
	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(1997, 7, 2);
		int age = DateUtils.getAge(c.getTime());
		System.out.println(age);
	}
	
	@Test
	public void testIsNumber() {
		String src = "aaaaa";
		boolean b = StringUtil.isNumber(src);
		if (b) {
			System.out.println("是数字");
		} else {
			System.out.println("不是数字");
		}
	}
	
	@Test
	public void testHashTest() {
		String src = "";
		boolean b = StringUtil.hasText(src);
		if (b) {
			System.out.println("有值的");
		} else {
			System.out.println("无值的");
		}
	}
}
