package com.foods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.utils.ConnectionUtils;
/*
public Integer id;
public String name;
public String category;
public Double foodsWeight;
public Double calorie;
public Double carbohydrate;
public Double fat;
public Double cellulose;
public Double vitamin_A;
public Double magnesium;
public Double calcium;
public Double iron;
public Double potassium;
public String estimate;
*/
public class FoodDaoImpl implements FoodDao {

	@Override
	public List<Food> SelectAllFood() {
		List<Food> foods = new ArrayList<Food>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,name,category,foodsWeight,calorie,carbohydrate,fat,cellulose,vitamin_A,magnesium,calcium,iron,potassium,estimate from foods";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setId(rs.getInt("id"));
				food.setName(rs.getString("name"));
				food.setCategory(rs.getString("category"));
				food.setFoodsWeight(rs.getDouble("foodsWeight"));
				food.setCalorie(rs.getDouble("calorie"));
				food.setCarbohydrate(rs.getDouble("carbohydrate"));
				food.setFat(rs.getDouble("fat"));
				food.setCellulose(rs.getDouble("cellulose"));
				food.setVitamin_A(rs.getDouble("vitamin_A"));
				food.setMagnesium(rs.getDouble("magnesium"));
				food.setCalcium(rs.getDouble("calcium"));
				food.setIron(rs.getDouble("iron"));
				food.setPotassium(rs.getDouble("potassium"));
				food.setEstimate(rs.getString("estimate"));
				foods.add(food);
			}
			return foods;
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
	public void insertFood(String name, String category, Double foodsWeight, Double calorie, Double carbohydrate,
			Double fat, Double cellulose, Double vitamin_A, Double magnesium, Double calcium, Double iron,
			Double potassium, String estimate) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void deleteFood(Integer id) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Food getDishByFoodname(String name) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Food getDishById(Integer id) {
		// TODO 自动生成的方法存根
		return null;
	}

	

}
