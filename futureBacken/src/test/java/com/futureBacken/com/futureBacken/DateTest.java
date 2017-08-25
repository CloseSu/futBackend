package com.futureBacken.com.futureBacken;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.futureBacken.utils.DateHelper;

@RunWith(SpringJUnit4ClassRunner.class)
public class DateTest {

	private DateHelper dateHelper;
	
	@Before
	public void init() {
		dateHelper = new DateHelper();
	}
	
	@Test
	public void TestDateToString() throws ParseException {
		String testString = "2017/08/24";
		Date getDate = dateHelper.stringToDate(testString,"yyyy/MM/dd");
		Date date = new Date("2017/08/24");
		assertEquals(date, getDate);
	}
	
}
