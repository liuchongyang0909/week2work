package com.liuchongyang.utils.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.liuchongyang.common.utils.StreamUtil;

public class StreamTest {
	@Test
	public void test() {
		try {
			List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/goods.txt"));
			
			for (String string : list) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
