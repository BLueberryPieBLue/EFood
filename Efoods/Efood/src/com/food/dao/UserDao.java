package com.food.dao;

import com.food.beans.User;

public interface UserDao {
	public User getUserByUsernameAndPassword(String username,String password) throws Exception;
	public User getUserByUsername(String username);
	public void insertUser(String username,String password);
}
