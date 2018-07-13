package com.futureBacken.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Trade {

 	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 	
 	@Transient
    private User user;
 	
 	@Column(name = "userid", nullable = false)
 	private Long userid;
 	
    @Column(name = "tradetype", nullable = false)
 	private String tradetype;
 	
    @Column(name = "date", nullable = false)
 	private String date;
    
    @Column(name = "buyprice", nullable = true)
 	private BigDecimal buyprice;
    
    @Column(name = "sellprice", nullable = true)
 	private BigDecimal sellprice;
    
    @Column(name = "buyunits", nullable = true)
 	private BigDecimal buyunits;
    
    @Column(name = "sellunits", nullable = true)
 	private BigDecimal sellunits;
    
    @Column(name = "totolunits", nullable = true)
 	private BigDecimal totolunits;
    
    @Column(name = "totolmoney", nullable = true)
 	private BigDecimal totolmoney;
    
    @Column(name = "processed", nullable = true)
    private Boolean processed = false;

	@Column(name = "percentage", nullable = true)
	private BigDecimal percentage;

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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BigDecimal getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(BigDecimal buyprice) {
		this.buyprice = buyprice;
	}
	public BigDecimal getSellprice() {
		return sellprice;
	}
	public void setSellprice(BigDecimal sellprice) {
		this.sellprice = sellprice;
	}
	public BigDecimal getBuyunits() {
		return buyunits;
	}
	public void setBuyunits(BigDecimal buyunits) {
		this.buyunits = buyunits;
	}
	public BigDecimal getSellunits() {
		return sellunits;
	}
	public void setSellunits(BigDecimal sellunits) {
		this.sellunits = sellunits;
	}
	public BigDecimal getTotolunits() {
		return totolunits;
	}
	public void setTotolunits(BigDecimal totolunits) {
		this.totolunits = totolunits;
	}
	public BigDecimal getTotolmoney() {
		return totolmoney;
	}
	public void setTotolmoney(BigDecimal totolmoney) {
		this.totolmoney = totolmoney;
	}
	public String getTradetype() {
		return tradetype;
	}
	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Boolean getProcessed() {
		return processed;
	}
	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
}
