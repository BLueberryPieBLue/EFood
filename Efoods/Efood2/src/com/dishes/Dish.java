package com.dishes;
/*
 * DROP TABLE IF EXISTS `dishes`;
CREATE TABLE `dishes` (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `foodName` varchar(255) DEFAULT NULL,
  `foodPrice` float DEFAULT '5' COMMENT '食物价格',
  `foodWeight` float DEFAULT '500' COMMENT '食物重量',
  `cost_performance` int(11) DEFAULT '20' COMMENT '性价比',
  `address` varchar(255) DEFAULT NULL COMMENT '餐厅',
  `date` varchar(255) DEFAULT NULL COMMENT '生产时间',
  `firstCategory` varchar(255) DEFAULT NULL,
  `secondCategory` varchar(255) DEFAULT NULL,
  `foods` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;*/
public class Dish {
	public Integer id;
	public String foodName;
	public Double foodPrice;
	public Double foodWeight;
	public Integer cost_performance;
	public String address;
	public String date;
	public String firstCategory;
	public String secondCategory;
	public String foods;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public Double getFoodWeight() {
		return foodWeight;
	}
	public void setFoodWeight(Double foodWeight) {
		this.foodWeight = foodWeight;
	}
	public Integer getCost_performance() {
		return cost_performance;
	}
	public void setCost_performance(Integer cost_performance) {
		this.cost_performance = cost_performance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFirstCategory() {
		return firstCategory;
	}
	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}
	public String getSecondCategory() {
		return secondCategory;
	}
	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}
	public String getFoods() {
		return foods;
	}
	public void setFoods(String foods) {
		this.foods = foods;
	}
	@Override
	public String toString() {
		return "Dish [id=" + id + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodWeight=" + foodWeight
				+ ", cost_performance=" + cost_performance + ", address=" + address + ", date=" + date
				+ ", firstCategory=" + firstCategory + ", secondCategory=" + secondCategory + ", foods=" + foods + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cost_performance == null) ? 0 : cost_performance.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((firstCategory == null) ? 0 : firstCategory.hashCode());
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
		result = prime * result + ((foodPrice == null) ? 0 : foodPrice.hashCode());
		result = prime * result + ((foodWeight == null) ? 0 : foodWeight.hashCode());
		result = prime * result + ((foods == null) ? 0 : foods.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((secondCategory == null) ? 0 : secondCategory.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cost_performance == null) {
			if (other.cost_performance != null)
				return false;
		} else if (!cost_performance.equals(other.cost_performance))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (firstCategory == null) {
			if (other.firstCategory != null)
				return false;
		} else if (!firstCategory.equals(other.firstCategory))
			return false;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		if (foodPrice == null) {
			if (other.foodPrice != null)
				return false;
		} else if (!foodPrice.equals(other.foodPrice))
			return false;
		if (foodWeight == null) {
			if (other.foodWeight != null)
				return false;
		} else if (!foodWeight.equals(other.foodWeight))
			return false;
		if (foods == null) {
			if (other.foods != null)
				return false;
		} else if (!foods.equals(other.foods))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (secondCategory == null) {
			if (other.secondCategory != null)
				return false;
		} else if (!secondCategory.equals(other.secondCategory))
			return false;
		return true;
	}
	
	
	
}
