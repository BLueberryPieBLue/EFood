package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

/*
 * 初始化本系统的数据库
 * 注意:填写数据库 用户名 密码
 * 数据库配置文件db.properties
 */


public class InitializationMySQL {

	public static void main(String[] args) throws Exception {
		String username = "root";
		String password = "root";
		try {
			Connection conn = ConnectionUtils.getConn();
			Statement stat = (Statement) conn.createStatement();
			stat.executeUpdate("drop database canteen;");
			stat.close();
			System.out.println("drop database canteen;");
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
			stat0.executeUpdate("create database canteen charset='utf8';");
			stat0.close();
			conn0.close();
			System.out.println("create database canteen charset='utf8';");
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
				stat.executeUpdate("DROP TABLE IF EXISTS `admin`;\r\n" + 
						"CREATE TABLE `admin` (\r\n" + 
						"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
						"  `username` varchar(255) NOT NULL,\r\n" + 
						"  `password` varchar(255) NOT NULL,\r\n" + 
						"  `right` int(11) DEFAULT '0',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("DROP TABLE IF EXISTS `admin`;\r\n" + 
						"CREATE TABLE `admin` (\r\n" + 
						"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
						"  `username` varchar(255) NOT NULL,\r\n" + 
						"  `password` varchar(255) NOT NULL,\r\n" + 
						"  `right` int(11) DEFAULT '0',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("DROP TABLE IF EXISTS `dishes`;\r\n" + 
						"CREATE TABLE `dishes` (\r\n" + 
						"  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',\r\n" + 
						"  `foodName` varchar(255) DEFAULT NULL,\r\n" + 
						"  `foodPrice` float DEFAULT '5' COMMENT '食物价格',\r\n" + 
						"  `foodWeight` float DEFAULT '500' COMMENT '食物重量',\r\n" + 
						"  `cost_performance` int(11) DEFAULT '20' COMMENT '性价比',\r\n" + 
						"  `address` varchar(255) DEFAULT NULL COMMENT '餐厅',\r\n" + 
						"  `date` varchar(255) DEFAULT NULL COMMENT '生产时间',\r\n" + 
						"  `firstCategory` varchar(255) DEFAULT NULL,\r\n" + 
						"  `secondCategory` varchar(255) DEFAULT NULL,\r\n" + 
						"  `foods` varchar(255) DEFAULT NULL,\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("DROP TABLE IF EXISTS `dishes`;\r\n" + 
						"CREATE TABLE `dishes` (\r\n" + 
						"  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',\r\n" + 
						"  `foodName` varchar(255) DEFAULT NULL,\r\n" + 
						"  `foodPrice` float DEFAULT '5' COMMENT '食物价格',\r\n" + 
						"  `foodWeight` float DEFAULT '500' COMMENT '食物重量',\r\n" + 
						"  `cost_performance` int(11) DEFAULT '20' COMMENT '性价比',\r\n" + 
						"  `address` varchar(255) DEFAULT NULL COMMENT '餐厅',\r\n" + 
						"  `date` varchar(255) DEFAULT NULL COMMENT '生产时间',\r\n" + 
						"  `firstCategory` varchar(255) DEFAULT NULL,\r\n" + 
						"  `secondCategory` varchar(255) DEFAULT NULL,\r\n" + 
						"  `foods` varchar(255) DEFAULT NULL,\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("DROP TABLE IF EXISTS `foods`;\r\n" + 
						"CREATE TABLE `foods` (\r\n" + 
						"  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',\r\n" + 
						"  `name` varchar(255) DEFAULT NULL COMMENT '名称',\r\n" + 
						"  `category` varchar(255) DEFAULT NULL COMMENT '分类',\r\n" + 
						"  `health_index` varchar(11) DEFAULT NULL COMMENT '健康指数',\r\n" + 
						"  `foodsWeight` float DEFAULT '100' COMMENT '重量',\r\n" + 
						"  `calorie` float unsigned DEFAULT '0' COMMENT '热量',\r\n" + 
						"  `carbohydrate` float unsigned DEFAULT '0' COMMENT '碳水化合物',\r\n" + 
						"  `fat` float unsigned DEFAULT '0' COMMENT '脂肪',\r\n" + 
						"  `protein` float unsigned DEFAULT '0' COMMENT '蛋白质',\r\n" + 
						"  `cellulose` float unsigned DEFAULT '0' COMMENT '纤维素',\r\n" + 
						"  `vitamin_A` float unsigned DEFAULT '0' COMMENT '维生素A',\r\n" + 
						"  `magnesium` float unsigned DEFAULT '0' COMMENT '镁',\r\n" + 
						"  `calcium` float unsigned DEFAULT '0' COMMENT '钙',\r\n" + 
						"  `iron` float unsigned DEFAULT '0' COMMENT '铁',\r\n" + 
						"  `potassium` float unsigned DEFAULT '0' COMMENT '钾',\r\n" + 
						"  `sodium` float unsigned DEFAULT '0' COMMENT '钠',\r\n" + 
						"  `estimate` varchar(255) DEFAULT NULL COMMENT '评价',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("DROP TABLE IF EXISTS `foods`;\r\n" + 
						"CREATE TABLE `foods` (\r\n" + 
						"  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '编号',\r\n" + 
						"  `name` varchar(255) DEFAULT NULL COMMENT '名称',\r\n" + 
						"  `category` varchar(255) DEFAULT NULL COMMENT '分类',\r\n" + 
						"  `health_index` varchar(11) DEFAULT NULL COMMENT '健康指数',\r\n" + 
						"  `foodsWeight` float DEFAULT '100' COMMENT '重量',\r\n" + 
						"  `calorie` float unsigned DEFAULT '0' COMMENT '热量',\r\n" + 
						"  `carbohydrate` float unsigned DEFAULT '0' COMMENT '碳水化合物',\r\n" + 
						"  `fat` float unsigned DEFAULT '0' COMMENT '脂肪',\r\n" + 
						"  `protein` float unsigned DEFAULT '0' COMMENT '蛋白质',\r\n" + 
						"  `cellulose` float unsigned DEFAULT '0' COMMENT '纤维素',\r\n" + 
						"  `vitamin_A` float unsigned DEFAULT '0' COMMENT '维生素A',\r\n" + 
						"  `magnesium` float unsigned DEFAULT '0' COMMENT '镁',\r\n" + 
						"  `calcium` float unsigned DEFAULT '0' COMMENT '钙',\r\n" + 
						"  `iron` float unsigned DEFAULT '0' COMMENT '铁',\r\n" + 
						"  `potassium` float unsigned DEFAULT '0' COMMENT '钾',\r\n" + 
						"  `sodium` float unsigned DEFAULT '0' COMMENT '钠',\r\n" + 
						"  `estimate` varchar(255) DEFAULT NULL COMMENT '评价',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=utf8;");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("DROP TABLE IF EXISTS `orderhistory`;\r\n" + 
						"CREATE TABLE `orderhistory` (\r\n" + 
						"  `id` int(11) NOT NULL,\r\n" + 
						"  `studentId` varchar(255) DEFAULT NULL,\r\n" + 
						"  `dishesId` varchar(255) DEFAULT NULL,\r\n" + 
						"  `reserveTime` varchar(255) DEFAULT NULL,\r\n" + 
						"  `pickTime` varchar(255) DEFAULT NULL,\r\n" + 
						"  `orderState` int(11) DEFAULT NULL,\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB DEFAULT CHARSET=utf8;\r\n" + 
						"");
				stat.close();
				System.out.println("DROP TABLE IF EXISTS `orderhistory`;\r\n" + 
						"CREATE TABLE `orderhistory` (\r\n" + 
						"  `id` int(11) NOT NULL,\r\n" + 
						"  `studentId` varchar(255) DEFAULT NULL,\r\n" + 
						"  `dishesId` varchar(255) DEFAULT NULL,\r\n" + 
						"  `reserveTime` varchar(255) DEFAULT NULL,\r\n" + 
						"  `pickTime` varchar(255) DEFAULT NULL,\r\n" + 
						"  `orderState` int(11) DEFAULT NULL,\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB DEFAULT CHARSET=utf8;\r\n" + 
						"");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Statement stat = (Statement) conn.createStatement();
				stat.executeUpdate("DROP TABLE IF EXISTS `student`;\r\n" + 
						"CREATE TABLE `student` (\r\n" + 
						"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
						"  `stuId` varchar(16) DEFAULT NULL,\r\n" + 
						"  `stuName` varchar(255) DEFAULT NULL,\r\n" + 
						"  `gender` varchar(255) DEFAULT NULL,\r\n" + 
						"  `balance` float(255,0) DEFAULT '100',\r\n" + 
						"  `tel` varchar(255) DEFAULT NULL,\r\n" + 
						"  `major` varchar(255) DEFAULT '软件工程',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;");
				stat.close();
				System.out.println("DROP TABLE IF EXISTS `student`;\r\n" + 
						"CREATE TABLE `student` (\r\n" + 
						"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
						"  `stuId` varchar(16) DEFAULT NULL,\r\n" + 
						"  `stuName` varchar(255) DEFAULT NULL,\r\n" + 
						"  `gender` varchar(255) DEFAULT NULL,\r\n" + 
						"  `balance` float(255,0) DEFAULT '100',\r\n" + 
						"  `tel` varchar(255) DEFAULT NULL,\r\n" + 
						"  `major` varchar(255) DEFAULT '软件工程',\r\n" + 
						"  PRIMARY KEY (`id`)\r\n" + 
						") ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;");
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
