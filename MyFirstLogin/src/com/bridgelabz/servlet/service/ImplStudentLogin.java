package com.bridgelabz.servlet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.servlet.model.Student;
import com.bridgelabz.servlet.repository.JdbcConnectivity;

public class ImplStudentLogin {

	

	public int insertStudent(Student student) throws SQLException {
		Connection con=JdbcConnectivity.getConnection();
		String query = "insert into student values(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, student.getName());
		pst.setString(2, student.getmailId());
		pst.setString(3, student.getMobNumber());
		pst.setString(4, student.getPassword());

		return pst.executeUpdate();

	}

	public Student getStudent(String mailId, String password) throws SQLException

	{
		Connection con=JdbcConnectivity.getConnection();
		System.out.println("In get");
		Student student = new Student();

		String query = "select * from studentData where mailId=? and password=?";

		PreparedStatement pst = con.prepareStatement(query);
		System.out.println("set 2");
		pst.setString(1, mailId);
		pst.setString(2, password);
		System.out.println("In set");
		ResultSet rs = pst.executeQuery();
		//System.out.println("resultset" + rs.next());
		while (rs.next()) {
			student.setName(rs.getString(1));
			student.setmailId(rs.getString(2));
			student.setMobNumber(rs.getString(3));
			student.setPassword(rs.getString(4));

		}
		return student;
	}

}
