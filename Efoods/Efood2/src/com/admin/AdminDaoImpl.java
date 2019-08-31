package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.utils.ConnectionUtils;
/*
private Integer id;
public String username;
private String password;
private Integer right;
*/
public class AdminDaoImpl implements AdminDao {

	@Override
	public List<Admin> SelectAllAdmin() {
		List<Admin> admins = new ArrayList<Admin>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,username,password,right from admin";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setUsername(rs.getString("username"));
				admin.setPassword(rs.getString("password"));
				admin.setRight(rs.getInt("right"));
				admins.add(admin);
			}
			return admins;
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
	public void insertAdmin(String username, String password, Integer right) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void deleteAdmin(Integer id) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Admin getAdminByUsername(String username) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Admin getAdminById(Integer id) {
		// TODO 自动生成的方法存根
		return null;
	}

	
	

}
