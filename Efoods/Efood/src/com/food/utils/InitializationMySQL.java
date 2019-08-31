package com.food.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

/*
 * 运行系统之前请运行此类InitializationMySQL
 * 初始化本系统的数据库
 * 注意:填写数据库 用户名 密码
 * 数据库配置文件db.properties
 */
/*
 * 
 ******************************************************************************************************************************
drop database Efood;

create database Efood charset='utf8';
use Efood;
CREATE TABLE user (
id INT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(500) NOT NULL,
password VARCHAR(500) NOT NULL
) engine=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE dish (
id INT AUTO_INCREMENT PRIMARY KEY,
 dishname VARCHAR(500) NOT NULL,
price VARCHAR(500) NOT NULL
) engine=InnoDB DEFAULT CHARSET=utf8;


*******************************************************************************************************************************
 * 
 **/

public class InitializationMySQL {

	public static void main(String[] args) throws Exception {
		String username = "root";
		String password = "";
		try {
			Connection conn = ConnectionUtils.getConn();
			Statement stat = (Statement) conn.createStatement();
			stat.executeUpdate("drop database Efood;");
			stat.close();
			System.out.println("drop database Efood;");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConn();
		}
		try {
			// 一开始必须填一个已经存在的数据库 默认为数据库test
			String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
			Connection conn0 = DriverManager.getConnection(url, username, password);
			Statement stat0 = (Statement) conn0.createStatement();
			stat0.executeUpdate("create database Efood charset='utf8';");
			stat0.close();
			conn0.close();
			System.out.println("create database Efood charset='utf8';");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Connection conn = ConnectionUtils.getConn();
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("SET SQL_SAFE_UPDATES = 0;");
				stat.close();
				System.out.println("SET SQL_SAFE_UPDATES = 0;");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("CREATE TABLE user (\r\n" + 
						"id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + 
						" username VARCHAR(500) NOT NULL,\r\n" + 
						"password VARCHAR(500) NOT NULL\r\n" + 
						") engine=InnoDB DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("CREATE TABLE user (\r\n" + 
						"id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + 
						" username VARCHAR(500) NOT NULL,\r\n" + 
						"password VARCHAR(500) NOT NULL\r\n" + 
						") engine=InnoDB DEFAULT CHARSET=utf8;");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("CREATE TABLE dish (\r\n" + 
						"id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + 
						" dishname VARCHAR(500) NOT NULL,\r\n" + 
						"price VARCHAR(500) NOT NULL\r\n" + 
						") engine=InnoDB DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("CREATE TABLE dish (\r\n" + 
						"id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + 
						" dishname VARCHAR(500) NOT NULL,\r\n" + 
						"price VARCHAR(500) NOT NULL\r\n" + 
						") engine=InnoDB DEFAULT CHARSET=utf8;");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtils.closeConn();
		}

	}

}
