package com.futureBacken.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tsecweighted {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
    @Column(name = "date", nullable = false)
	private String date;
    
    @Column(name = "milliseconds", nullable = true)
	private Long milliseconds;
    
    @Column(name = "open", nullable = false)
	private BigDecimal open;
    
    @Column(name = "high", nullable = false)
	private BigDecimal high;
    
    @Column(name = "low", nullable = false)
	private BigDecimal low;
    
    @Column(name = "close", nullable = false)
   	private BigDecimal close;
    
    @Column(name = "adjClose", nullable = false)
	private BigDecimal adjClose;
    
    @Column(name = "volume", nullable = false)
	private BigDecimal volume;

    @Column(name = "avg20", nullable = false)
    private BigDecimal avg20;
    
    @Column(name = "avg60", nullable = false)
    private BigDecimal avg60;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public BigDecimal getAdjClose() {
		return adjClose;
	}

	public void setAdjClose(BigDecimal adjClose) {
		this.adjClose = adjClose;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public Long getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(Long milliseconds) {
		this.milliseconds = milliseconds;
	}

	public BigDecimal getAvg20() {
		return avg20;
	}

	public void setAvg20(BigDecimal avg20) {
		this.avg20 = avg20;
	}

	public BigDecimal getAvg60() {
		return avg60;
	}

	public void setAvg60(BigDecimal avg60) {
		this.avg60 = avg60;
	}
				
	
}
