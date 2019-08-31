package com.foods;
/*
 * DROP TABLE IF EXISTS `foods`;
CREATE TABLE `foods` (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `category` varchar(255) DEFAULT NULL COMMENT '分类',
  `health_index` varchar(11) DEFAULT NULL COMMENT '健康指数',
  `foodsWeight` float DEFAULT '100' COMMENT '重量',
  `calorie` float unsigned DEFAULT '0' COMMENT '热量',
  `carbohydrate` float unsigned DEFAULT '0' COMMENT '碳水化合物',
  `fat` float unsigned DEFAULT '0' COMMENT '脂肪',
  `protein` float unsigned DEFAULT '0' COMMENT '蛋白质',
  `cellulose` float unsigned DEFAULT '0' COMMENT '纤维素',
  `vitamin_A` float unsigned DEFAULT '0' COMMENT '维生素A',
  `magnesium` float unsigned DEFAULT '0' COMMENT '镁',
  `calcium` float unsigned DEFAULT '0' COMMENT '钙',
  `iron` float unsigned DEFAULT '0' COMMENT '铁',
  `potassium` float unsigned DEFAULT '0' COMMENT '钾',
  `sodium` float unsigned DEFAULT '0' COMMENT '钠',
  `estimate` varchar(255) DEFAULT NULL COMMENT '评价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=utf8;*/
public class Food {
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getFoodsWeight() {
		return foodsWeight;
	}
	public void setFoodsWeight(Double foodsWeight) {
		this.foodsWeight = foodsWeight;
	}
	public Double getCalorie() {
		return calorie;
	}
	public void setCalorie(Double calorie) {
		this.calorie = calorie;
	}
	public Double getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public Double getFat() {
		return fat;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public Double getCellulose() {
		return cellulose;
	}
	public void setCellulose(Double cellulose) {
		this.cellulose = cellulose;
	}
	public Double getVitamin_A() {
		return vitamin_A;
	}
	public void setVitamin_A(Double vitamin_A) {
		this.vitamin_A = vitamin_A;
	}
	public Double getMagnesium() {
		return magnesium;
	}
	public void setMagnesium(Double magnesium) {
		this.magnesium = magnesium;
	}
	public Double getCalcium() {
		return calcium;
	}
	public void setCalcium(Double calcium) {
		this.calcium = calcium;
	}
	public Double getIron() {
		return iron;
	}
	public void setIron(Double iron) {
		this.iron = iron;
	}
	public Double getPotassium() {
		return potassium;
	}
	public void setPotassium(Double potassium) {
		this.potassium = potassium;
	}
	public String getEstimate() {
		return estimate;
	}
	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", category=" + category + ", foodsWeight=" + foodsWeight
				+ ", calorie=" + calorie + ", carbohydrate=" + carbohydrate + ", fat=" + fat + ", cellulose="
				+ cellulose + ", vitamin_A=" + vitamin_A + ", magnesium=" + magnesium + ", calcium=" + calcium
				+ ", iron=" + iron + ", potassium=" + potassium + ", estimate=" + estimate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calcium == null) ? 0 : calcium.hashCode());
		result = prime * result + ((calorie == null) ? 0 : calorie.hashCode());
		result = prime * result + ((carbohydrate == null) ? 0 : carbohydrate.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((cellulose == null) ? 0 : cellulose.hashCode());
		result = prime * result + ((estimate == null) ? 0 : estimate.hashCode());
		result = prime * result + ((fat == null) ? 0 : fat.hashCode());
		result = prime * result + ((foodsWeight == null) ? 0 : foodsWeight.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iron == null) ? 0 : iron.hashCode());
		result = prime * result + ((magnesium == null) ? 0 : magnesium.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((potassium == null) ? 0 : potassium.hashCode());
		result = prime * result + ((vitamin_A == null) ? 0 : vitamin_A.hashCode());
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
		Food other = (Food) obj;
		if (calcium == null) {
			if (other.calcium != null)
				return false;
		} else if (!calcium.equals(other.calcium))
			return false;
		if (calorie == null) {
			if (other.calorie != null)
				return false;
		} else if (!calorie.equals(other.calorie))
			return false;
		if (carbohydrate == null) {
			if (other.carbohydrate != null)
				return false;
		} else if (!carbohydrate.equals(other.carbohydrate))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (cellulose == null) {
			if (other.cellulose != null)
				return false;
		} else if (!cellulose.equals(other.cellulose))
			return false;
		if (estimate == null) {
			if (other.estimate != null)
				return false;
		} else if (!estimate.equals(other.estimate))
			return false;
		if (fat == null) {
			if (other.fat != null)
				return false;
		} else if (!fat.equals(other.fat))
			return false;
		if (foodsWeight == null) {
			if (other.foodsWeight != null)
				return false;
		} else if (!foodsWeight.equals(other.foodsWeight))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (iron == null) {
			if (other.iron != null)
				return false;
		} else if (!iron.equals(other.iron))
			return false;
		if (magnesium == null) {
			if (other.magnesium != null)
				return false;
		} else if (!magnesium.equals(other.magnesium))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (potassium == null) {
			if (other.potassium != null)
				return false;
		} else if (!potassium.equals(other.potassium))
			return false;
		if (vitamin_A == null) {
			if (other.vitamin_A != null)
				return false;
		} else if (!vitamin_A.equals(other.vitamin_A))
			return false;
		return true;
	}
	
	
	
}
