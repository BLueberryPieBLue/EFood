package com.admin;

import java.util.List;
/*
	private Integer id;
	public String username;
	private String password;
	private Integer right;
*/

public interface AdminDao {
	public List<Admin> SelectAllAdmin();
	public  void insertAdmin(String username,String password,Integer right);
	public  void deleteAdmin(Integer id) ;
	public Admin getAdminByUsername(String username) ;
	public Admin getAdminById(Integer id) ;
}
