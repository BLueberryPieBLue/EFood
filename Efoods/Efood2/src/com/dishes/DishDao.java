package com.dishes;
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
import java.util.List;
public interface DishDao {
	public List<Dish> SelectAllDish();
	public  void insertDish(String foodName,Double foodPrice,Double foodWeight,Integer cost_performance,String address,String date,String firstCategory,String secondCategory,String foods) ;
	public  void deleteDish(Integer id);
	public Dish getDishByDishname(String foodName);
	public Dish getDishById(Integer id);
}
