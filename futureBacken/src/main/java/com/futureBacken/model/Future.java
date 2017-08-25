package com.futureBacken.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Future {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "date", nullable = true)
	private String date;
	
	@Column(name = "milliseconds", nullable = true)
	private Long milliseconds;
	
	@Column(name = "contract", nullable = true)
	private String contract;//契約
	
	@Column(name = "contractMonth", nullable = true)
	private String contractMonth;//到期 月份	(週別)
	
	@Column(name = "open", nullable = true)
	private BigDecimal open;//開盤價
	
	@Column(name = "high", nullable = true)
	private BigDecimal high;//最高價
	
	@Column(name = "low", nullable = true)
	private BigDecimal low;//最低價	
	
	@Column(name = "last", nullable = true)
	private BigDecimal last;//最後成交價
	
	@Column(name = "changeMoney", nullable = true)
	private String changeMoney;//漲跌價
	
	@Column(name = "percent", nullable = true)
	private String percent;//漲跌%
	
	@Column(name = "volumn", nullable = true)
	private BigDecimal volumn;//*成交量
	
	@Column(name = "settlementPrice", nullable = true)
	private BigDecimal settlementPrice;//結算價
	
	@Column(name = "openInteres", nullable = true)
	private BigDecimal openInteres;//*未沖銷契約量
	
	@Column(name = "bestBid", nullable = true)
	private BigDecimal bestBid;//最後最佳買價
	
	@Column(name = "bestAsk", nullable = true)
	private BigDecimal bestAsk;//最後最佳賣價
	
	@Column(name = "historicalHigh", nullable = true)
	private BigDecimal historicalHigh;//歷史最高價
	
	@Column(name = "historicalLow", nullable = true)
	private BigDecimal historicalLow;//歷史最低價

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getContractMonth() {
		return contractMonth;
	}

	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getLast() {
		return last;
	}

	public void setLast(BigDecimal last) {
		this.last = last;
	}

	public String getChangeMoney() {
		return changeMoney;
	}

	public void setChangeMoney(String changeMoney) {
		this.changeMoney = changeMoney;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public BigDecimal getVolumn() {
		return volumn;
	}

	public void setVolumn(BigDecimal volumn) {
		this.volumn = volumn;
	}

	public BigDecimal getSettlementPrice() {
		return settlementPrice;
	}

	public void setSettlementPrice(BigDecimal settlementPrice) {
		this.settlementPrice = settlementPrice;
	}

	public BigDecimal getOpenInteres() {
		return openInteres;
	}

	public void setOpenInteres(BigDecimal openInteres) {
		this.openInteres = openInteres;
	}

	public BigDecimal getBestBid() {
		return bestBid;
	}

	public void setBestBid(BigDecimal bestBid) {
		this.bestBid = bestBid;
	}

	public BigDecimal getBestAsk() {
		return bestAsk;
	}

	public void setBestAsk(BigDecimal bestAsk) {
		this.bestAsk = bestAsk;
	}

	public BigDecimal getHistoricalHigh() {
		return historicalHigh;
	}

	public void setHistoricalHigh(BigDecimal historicalHigh) {
		this.historicalHigh = historicalHigh;
	}

	public BigDecimal getHistoricalLow() {
		return historicalLow;
	}

	public void setHistoricalLow(BigDecimal historicalLow) {
		this.historicalLow = historicalLow;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(Long milliseconds) {
		this.milliseconds = milliseconds;
	}
	
}
