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
	
	@Column(name = "contract", nullable = true)
	private String contract;
	
	@Column(name = "contractMonth", nullable = true)
	private BigDecimal contractMonth;
	
	@Column(name = "open", nullable = true)
	private BigDecimal open;
	
	@Column(name = "high", nullable = true)
	private BigDecimal high;
	
	@Column(name = "low", nullable = true)
	private BigDecimal low;
	
	@Column(name = "last", nullable = true)
	private BigDecimal last;
	
	@Column(name = "changeMoney", nullable = true)
	private BigDecimal changeMoney;
	
	@Column(name = "percent", nullable = true)
	private BigDecimal percent;
	
	@Column(name = "volumn", nullable = true)
	private BigDecimal volumn;
	
	@Column(name = "settlementPrice", nullable = true)
	private BigDecimal settlementPrice;
	
	@Column(name = "openInteres", nullable = true)
	private BigDecimal openInteres;
	
	@Column(name = "bestBid", nullable = true)
	private BigDecimal bestBid;
	
	@Column(name = "bestAsk", nullable = true)
	private BigDecimal bestAsk;
	
	@Column(name = "historicalHigh", nullable = true)
	private BigDecimal historicalHigh;
	
	@Column(name = "historicalLow", nullable = true)
	private BigDecimal historicalLow;

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

	public BigDecimal getContractMonth() {
		return contractMonth;
	}

	public void setContractMonth(BigDecimal contractMonth) {
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

	public BigDecimal getChangeMoney() {
		return changeMoney;
	}

	public void setChangeMoney(BigDecimal changeMoney) {
		this.changeMoney = changeMoney;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
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
	
	
}
