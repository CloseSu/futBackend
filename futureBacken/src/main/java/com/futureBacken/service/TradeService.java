package com.futureBacken.service;

import java.util.List;
import java.util.Map;

import com.futureBacken.model.Trade;

public interface TradeService {
	void setTradeData(Trade trade);
	List<Trade> findTradeList(String dateStart, String dateEnd);
	void updateTradeList(Map<String, Object> conditions);
}
