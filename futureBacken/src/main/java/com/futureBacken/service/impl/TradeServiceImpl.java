package com.futureBacken.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.futureBacken.dao.TradeDao;
import com.futureBacken.model.Trade;
import com.futureBacken.service.TradeService;

@Service
@Transactional
public class TradeServiceImpl implements TradeService {

	@Autowired
	private TradeDao tradeDao;
	
	@Override
	public void setTradeData(Trade trade) {
		tradeDao.save(trade);
	}

	@Override
	public List<Trade> findTradeList(String dateStart, String dateEnd) {
		return tradeDao.findTradeList(dateStart, dateEnd);
	}

	@Override
	public void updateTradeList(Map<String, Object> conditions) {
		Map<String,Map<String,Object>> dataMaps = processTradeData(conditions);
		setTradeData(dataMaps);
	}

	private Map<String,Map<String,Object>> processTradeData(Map<String, Object> conditions) {
		Map<String,Map<String,Object>> dataMaps = new HashMap<>();
		
		for(String key: conditions.keySet()) {
			String[] keysplited = key.split("_");
			String id = keysplited[1];
			String valueKey = keysplited[0];
			Object data = conditions.get(key);
			
			Map<String,Object> dataMap = dataMaps.get(id) == null? new HashMap<>(): dataMaps.get(id);
			dataMap.put(valueKey, data);
			dataMaps.put(id, dataMap);
		}
		return dataMaps;
	}
	
	private void setTradeData(Map<String,Map<String,Object>> dataMaps) {
		for(String key: dataMaps.keySet()) {
			Map<String,Object> datas = dataMaps.get(key);
			Trade formDb = tradeDao.findById(Long.parseLong(key));
			
			if(formDb != null) {
				for(String valueKey: datas.keySet()) {
					if(valueKey.equals("totoUnit") && datas.get(valueKey) != null) {
						formDb.setTotolunits(new BigDecimal(datas.get(valueKey).toString()));
					}
					if(valueKey.equals("totoMoney") && datas.get(valueKey) != null) {
						formDb.setTotolmoney(new BigDecimal(datas.get(valueKey).toString()));
					}
				}
				tradeDao.save(formDb);
			}
		}
	}
}
