package com.bridgelabz.servlet.service;

import com.bridgelabz.servlet.model.Student;

public interface StudentLogin
{
	
		   public int insertStudent(Student student);
		   public Student getStudent(String username,String password);
		   
	
}
