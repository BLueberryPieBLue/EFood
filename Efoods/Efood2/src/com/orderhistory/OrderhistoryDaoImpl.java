package com.orderhistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.utils.ConnectionUtils;
/*
public Integer id;
public String studentId;
public String dishesId;
public String reserveTime;
public String pickTime;
public Integer orderState;*/
public class OrderhistoryDaoImpl implements OrderhistoryDao {

	@Override
	public List<Orderhistory> SelectAllOrderhistory() {
		List<Orderhistory> orderhistorys = new ArrayList<Orderhistory>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,studentId,dishesId,reserveTime,pickTime,orderState from orderhistory";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orderhistory orderhistory = new Orderhistory();
				orderhistory.setId(rs.getInt("id"));
				orderhistory.setStudentId(rs.getString("studentId"));
				orderhistory.setDishesId(rs.getString("dishesId"));
				orderhistory.setReserveTime(rs.getString("reserveTime"));
				orderhistory.setPickTime(rs.getString("pickTime"));
				orderhistory.setOrderState(rs.getInt("orderState"));
				orderhistorys.add(orderhistory);
			}
			return orderhistorys;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionUtils.closeConn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void insertOrderhistory(String studentId, String dishesId, String reserveTime, String pickTime,
			Integer orderState) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void deleteOrderhistory(Integer id) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Orderhistory getOrderhistoryByStudentId(String studentId) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Orderhistory getOrderhistoryById(Integer id) {
		// TODO 自动生成的方法存根
		return null;
	}

	
	
	

}
