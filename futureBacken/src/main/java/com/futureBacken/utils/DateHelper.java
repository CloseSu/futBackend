package com.futureBacken.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

	public Date stringToDate(String raw, String template) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(template);
		Date date = sdf.parse(raw);
		return date;
	}
	
	public Long dateToMillisecond(Date raw) {
		return raw.getTime();
	}
	
	public Long stringDateToMillisecond(String raw) throws ParseException {
		return dateToMillisecond(stringToDate(raw,"yyyy/MM/dd"));
	}
	
	public String dateFormat(String raw) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = stringToDate(raw,"yyyy-MM-dd");
		return sdf.format(date);
	}
}
