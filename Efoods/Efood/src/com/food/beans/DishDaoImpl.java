package com.food.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.food.dao.DishDao;
import com.food.utils.ConnectionUtils;

public class DishDaoImpl implements DishDao {

	@Override
	public List<Dish> SelectAllDish() {
		List<Dish> dishes = new ArrayList<Dish>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,dishname,price from dish";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dish dish = new Dish();
				dish.setId(rs.getInt("id"));
				dish.setDishname(rs.getString("dishname"));
				dish.setPrice(rs.getString("price"));
				dishes.add(dish);
			}
			return dishes;
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
	public void insertDish(String dishname, String price) {
		try {
			if (dishname != ""&&price!="") {
				Connection conn = ConnectionUtils.getConn();
				String sql = "insert into dish (dishname,price) values(?,?) ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, dishname);
				ps.setString(2, price);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Dish getDishByDishname(String dishname) {
		Dish dish = null;
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,dishname,price from dish where dishname=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dishname);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dish = new Dish();
				dish.setId(rs.getInt("id"));
				dish.setDishname(rs.getString("dishname"));
				dish.setPrice(rs.getString("price"));
			}
			return dish;
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
	public void deleteDish(String id) {
		
		try {
		
				Connection conn = ConnectionUtils.getConn();
				String sql = "delete from dish where id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Dish getDishById(String id) {
		Dish dish = null;
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,dishname,price from dish where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dish = new Dish();
				dish.setId(rs.getInt("id"));
				dish.setDishname(rs.getString("dishname"));
				dish.setPrice(rs.getString("price"));
			}
			return dish;
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

}
