package com.orderhistory;
/*
DROP TABLE IF EXISTS `orderhistory`;
CREATE TABLE `orderhistory` (
  `id` int(11) NOT NULL,
  `studentId` varchar(255) DEFAULT NULL,
  `dishesId` varchar(255) DEFAULT NULL,
  `reserveTime` varchar(255) DEFAULT NULL,
  `pickTime` varchar(255) DEFAULT NULL,
  `orderState` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

*/
public class Orderhistory {
	public Integer id;
	public String studentId;
	public String dishesId;
	public String reserveTime;
	public String pickTime;
	public Integer orderState;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getDishesId() {
		return dishesId;
	}
	public void setDishesId(String dishesId) {
		this.dishesId = dishesId;
	}
	public String getReserveTime() {
		return reserveTime;
	}
	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}
	public String getPickTime() {
		return pickTime;
	}
	public void setPickTime(String pickTime) {
		this.pickTime = pickTime;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	@Override
	public String toString() {
		return "Orderhistory [id=" + id + ", studentId=" + studentId + ", dishesId=" + dishesId + ", reserveTime="
				+ reserveTime + ", pickTime=" + pickTime + ", orderState=" + orderState + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dishesId == null) ? 0 : dishesId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderState == null) ? 0 : orderState.hashCode());
		result = prime * result + ((pickTime == null) ? 0 : pickTime.hashCode());
		result = prime * result + ((reserveTime == null) ? 0 : reserveTime.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
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
		Orderhistory other = (Orderhistory) obj;
		if (dishesId == null) {
			if (other.dishesId != null)
				return false;
		} else if (!dishesId.equals(other.dishesId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderState == null) {
			if (other.orderState != null)
				return false;
		} else if (!orderState.equals(other.orderState))
			return false;
		if (pickTime == null) {
			if (other.pickTime != null)
				return false;
		} else if (!pickTime.equals(other.pickTime))
			return false;
		if (reserveTime == null) {
			if (other.reserveTime != null)
				return false;
		} else if (!reserveTime.equals(other.reserveTime))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	
}
