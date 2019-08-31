package com.food.beans;

import java.sql.*;

import com.food.dao.UserDao;
import com.food.utils.ConnectionUtils;


public class UserDaoImpl implements UserDao {
	public User getUserByUsernameAndPassword(String username,String password) throws Exception {
		User usr=null;

		try {		
			Connection conn=ConnectionUtils.getConn();
			
			String sql = "select id,username,password from user where username=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				usr=new User();
				usr.setId(rs.getInt("id"));
				usr.setUsername(rs.getString("username"));
				usr.setPassword(rs.getString("password"));
			}
			return usr;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtils.closeConn();
		}
		return null;
	}

	@Override
	public User getUserByUsername(String username) {
			User usr=null;
			try {
				Connection conn=ConnectionUtils.getConn();
				String sql = "select id,username,password from user where username=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, username);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					usr=new User();
					usr.setId(rs.getInt("id"));
					usr.setUsername(rs.getString("username"));
					usr.setPassword(rs.getString("password"));
				}
				return usr;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					ConnectionUtils.closeConn();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return null;
	}

	@Override
	public void insertUser(String username,String password) {
		try {
			Connection conn =ConnectionUtils.getConn();
			String sql="insert into user (username,password) values(?,?) ";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
