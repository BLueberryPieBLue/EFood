package com.foods;

import java.util.List;

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
public interface FoodDao {
	public List<Food> SelectAllFood();
	public  void insertFood(String name,String category,Double foodsWeight,Double calorie,Double carbohydrate,Double fat,Double cellulose,Double vitamin_A,Double magnesium,Double calcium,Double iron,Double potassium,String estimate) ;
	public  void deleteFood(Integer id);
	public Food getDishByFoodname(String name);
	public Food getDishById(Integer id);
}
