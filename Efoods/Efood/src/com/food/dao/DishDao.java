package com.food.dao;

import java.util.List;

import com.food.beans.Dish;

public interface DishDao {
	public List<Dish> SelectAllDish();
	public  void insertDish(String dishname,String price) ;
	public  void deleteDish(String id) ;
	public Dish getDishByDishname(String dishname) ;
	public Dish getDishById(String id) ;
}
