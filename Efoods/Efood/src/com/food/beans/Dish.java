package com.food.beans;

public class Dish {
	private Integer id;
	public String dishname;
	private String price;
	
	public Integer getId() {
		return id;
	}
	public String getDishname() {
		return dishname;
	}
	public String getPrice() {
		return price;
	}
	public void setId( Integer id) {
		this.id=id;
	}
	public void setDishname( String dishname) {
		this.dishname=dishname;
	}
	public void setPrice( String price) {
		this.price=price;
	}
	public String toString() {
		return id+" "+dishname+" "+price;
	}

}
