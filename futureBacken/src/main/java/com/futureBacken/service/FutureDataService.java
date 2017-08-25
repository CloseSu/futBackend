package com.futureBacken.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.futureBacken.model.Future;

public interface FutureDataService {
	List<Future> getDataToday() throws ParseException;
	List<Future> getHistoryData(String dateStart, String dateEnd, String contractMonth) throws ParseException;
	List<BigDecimal[]> getHistoryDataTransfer(String dateStart, String dateEnd, String contractMonth) throws ParseException;
	void loadHistoryData() throws ParseException;
	Map<String, Object> getHisoryTsecWeighted(String dateStart, String dateEnd) throws ParseException;
}
