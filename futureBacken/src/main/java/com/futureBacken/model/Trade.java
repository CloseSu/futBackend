package com.futureBacken.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trade {

 	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 	
 	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 	
    @Column(name = "date", nullable = false)
 	private String date;
    
    @Column(name = "buyPrice", nullable = true)
 	private BigDecimal buyPrice;
    
    @Column(name = "sellPrice", nullable = true)
 	private BigDecimal sellPrice;
    
    @Column(name = "buyUnits", nullable = true)
 	private BigDecimal buyUnits;
    
    @Column(name = "sellUnits", nullable = true)
 	private BigDecimal sellUnits;
    
    @Column(name = "totoUnits", nullable = true)
 	private BigDecimal totoUnits;
    
    @Column(name = "totolMoney", nullable = true)
 	private BigDecimal totolMoney;
 	 	
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
	public BigDecimal getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}
	public BigDecimal getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	public BigDecimal getBuyUnits() {
		return buyUnits;
	}
	public void setBuyUnits(BigDecimal buyUnits) {
		this.buyUnits = buyUnits;
	}
	public BigDecimal getSellUnits() {
		return sellUnits;
	}
	public void setSellUnits(BigDecimal sellUnits) {
		this.sellUnits = sellUnits;
	}
	public BigDecimal getTotoUnits() {
		return totoUnits;
	}
	public void setTotoUnits(BigDecimal totoUnits) {
		this.totoUnits = totoUnits;
	}
	public BigDecimal getTotolMoney() {
		return totolMoney;
	}
	public void setTotolMoney(BigDecimal totolMoney) {
		this.totolMoney = totolMoney;
	}
 	
 	
}
