package com.orderhistory;

import java.util.List;


/*
	public Integer id;
	public String studentId;
	public String dishesId;
	public String reserveTime;
	public String pickTime;
	public Integer orderState;*/
public interface OrderhistoryDao {
	public List<Orderhistory> SelectAllOrderhistory();
	public  void insertOrderhistory(String studentId,String dishesId,String reserveTime,String pickTime,Integer orderState) ;
	public  void deleteOrderhistory(Integer id);
	public Orderhistory getOrderhistoryByStudentId(String studentId);
	public Orderhistory getOrderhistoryById(Integer id);
}
