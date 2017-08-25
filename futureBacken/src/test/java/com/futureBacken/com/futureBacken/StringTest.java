package com.futureBacken.com.futureBacken;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class StringTest {
	
	@Test
	public void stringSplitTest() {
		String target = "日期：2017/08/24";
		String splited = target.split("：")[1];
		System.out.println(splited);
		assertEquals("2017/08/24", splited);
	}
	
	@Test
	public void stringSubstringTest() {
		String target = "日期：2017/08/24";
		String subs = target.substring(target.length()-10, target.length());
		System.out.println(subs);
		assertEquals("2017/08/24", subs);
	}
}