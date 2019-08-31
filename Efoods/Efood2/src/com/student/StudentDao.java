package com.student;

import java.util.List;


/*
	public Integer id;
	public String stuId;
	public String stuName;
	public String gender;
	public Double balance;
	public String tel;
	public String major;*/
public interface StudentDao {
	public List<Student> SelectAllStudent();
	public  void insertStudent(String stuId,String stuName,String gender,Double balance,String tel,String major) ;
	public  void deleteStudent(Integer id);
	public Student getStudentByStudentId(String studentId);
	public Student getStudentById(Integer id);
}
