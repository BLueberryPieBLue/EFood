package com.dishes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.utils.ConnectionUtils;
/*
private Integer id;
public String foodName;
private Double foodPrice;
private Double foodWeight;
private Integer cost_performance;
private String address;
private String date;
private String firstCategory;
private String secondCategory;
private String foods;
*/

public class DishDaoImpl implements DishDao {

	@Override
	public List<Dish> SelectAllDish() {
		List<Dish> dishes = new ArrayList<Dish>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,foodName,foodPrice,foodWeight,cost_performance,address,date,firstCategory,secondCategory,foods from dishes";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dish dish = new Dish();
				dish.setId(rs.getInt("id"));
				dish.setFoodName(rs.getString("foodName"));
				dish.setFoodPrice(rs.getDouble("foodPrice"));
				dish.setFoodWeight(rs.getDouble("foodWeight"));
				dish.setCost_performance(rs.getInt("cost_performance"));
				dish.setAddress(rs.getString("address"));
				dish.setDate(rs.getString("date"));
				dish.setFirstCategory(rs.getString("firstCategory"));
				dish.setSecondCategory(rs.getString("secondCategory"));
				dish.setFoods(rs.getString("foods"));
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
	public void insertDish(String foodName, Double foodPrice, Double foodWeight, Integer cost_performance,
			String address, String date, String firstCategory, String secondCategory, String foods) {
		try {
			if (foodName != ""&&foodPrice!=null) {
				Connection conn = ConnectionUtils.getConn();
				String sql = "insert into dishes (foodName,foodPrice,foodWeight,cost_performance,address,date,firstCategory,secondCategory,foods) values(?,?,?,?,?,?,?,?,?) ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, foodName);
				ps.setDouble(2, foodPrice);
				ps.setDouble(3, foodWeight);
				ps.setInt(4, cost_performance);
				ps.setString(5, address);
				ps.setString(6, date);
				ps.setString(7, firstCategory);
				ps.setString(8, secondCategory);
				ps.setString(9, foods);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteDish(Integer id) {
		try {
			
			Connection conn = ConnectionUtils.getConn();
			String sql = "delete from dishes where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	@Override
	public Dish getDishByDishname(String foodName) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Dish getDishById(Integer id) {
		// TODO 自动生成的方法存根
		return null;
	}

	
}
