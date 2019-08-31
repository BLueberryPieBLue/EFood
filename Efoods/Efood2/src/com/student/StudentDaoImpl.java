package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.utils.ConnectionUtils;
/*
public Integer id;
public String stuId;
public String stuName;
public String gender;
public Double balance;
public String tel;
public String major;*/
public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> SelectAllStudent() {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select id,stuId,stuName,gender,balance,tel,major from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setStuId(rs.getString("stuId"));
				student.setStuName(rs.getString("stuName"));
				student.setGender(rs.getString("gender"));
				student.setBalance(rs.getDouble("balance"));
				student.setTel(rs.getString("tel"));
				student.setMajor(rs.getString("major"));
				students.add(student);
			}
			return students;
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
	public void insertStudent(String stuId, String stuName, String gender, Double balance, String tel, String major) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Student getStudentByStudentId(String studentId) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO 自动生成的方法存根
		return null;
	}

	

}
