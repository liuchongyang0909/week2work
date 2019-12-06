package com.liuchongyang.domain;

public class Confition {
	private Double lowPrice;
	private Double heightPrice;
	private Integer lowSales;
	private Integer heightSales;
	private String orderName;
	private String orderMethod;
	public Double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public Double getHeightPrice() {
		return heightPrice;
	}
	public void setHeightPrice(Double heightPrice) {
		this.heightPrice = heightPrice;
	}
	public Integer getLowSales() {
		return lowSales;
	}
	public void setLowSales(Integer lowSales) {
		this.lowSales = lowSales;
	}
	public Integer getHeightSales() {
		return heightSales;
	}
	public void setHeightSales(Integer heightSales) {
		this.heightSales = heightSales;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
}
