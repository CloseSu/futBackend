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
	private BigDecimal ensureMoney = new BigDecimal(20750);
	
	@Override
	public void setTradeData(Trade trade) {
		tradeDao.save(trade);
	}

	@Override
	public List<Trade> findTradeList(String dateStart, String dateEnd) {
		porcessDataList(tradeDao.findTradeList(dateStart, dateEnd));
		return tradeDao.findTradeList(dateStart, dateEnd);
	}

	//caculate unit
	private void porcessDataList(List<Trade> dbList) {
		int index1 = 0;
		int index2 = 1;
		
		for(int i = 0; i < dbList.size(); i++) {
			Trade tradeDb = dbList.get(index1++);
			if(dbList.size() > index2) {
				Trade tradeDb2 = dbList.get(index2++);
				if((tradeDb.getProcessed() == null || tradeDb.getProcessed() == false) &&
						(tradeDb2.getProcessed() == null || tradeDb2.getProcessed() == false)	) {
					if(tradeDb.getTradetype().toUpperCase().equals("PB") && tradeDb2.getTradetype().toUpperCase().equals("PS")) {
						tradeDb2.setTotolunits(tradeDb2.getSellunits().subtract(tradeDb.getBuyunits()));
						BigDecimal money = (tradeDb2.getSellprice().subtract(tradeDb.getBuyprice()).multiply(tradeDb2.getSellunits()).multiply(new BigDecimal(50)));
						tradeDb2.setTotolmoney(money);
						tradeDb2.setPercentage(money.multiply(new BigDecimal(100)).divide(tradeDb2.getSellunits().multiply(ensureMoney), BigDecimal.ROUND_HALF_UP, 0));
						tradeDb.setProcessed(true);
						tradeDb2.setProcessed(true);
						tradeDao.save(tradeDb);
						tradeDao.save(tradeDb2);
					}
					if(tradeDb.getTradetype().equals("NS") && tradeDb2.getTradetype().equals("NB")) {
						tradeDb2.setTotolunits(tradeDb2.getBuyunits().subtract(tradeDb.getSellunits()));
						BigDecimal money = (tradeDb2.getBuyprice().subtract(tradeDb.getSellprice()).multiply(tradeDb2.getBuyunits()).multiply(new BigDecimal(50))).negate();
						tradeDb2.setTotolmoney(money);
						tradeDb2.setPercentage(money.multiply(new BigDecimal(100)).divide(tradeDb2.getBuyunits().multiply(ensureMoney), BigDecimal.ROUND_HALF_UP, 0));
						tradeDb.setProcessed(true);
						tradeDb2.setProcessed(true);
						tradeDao.save(tradeDb);
						tradeDao.save(tradeDb2);
					}


				}
			}
			
		}
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
