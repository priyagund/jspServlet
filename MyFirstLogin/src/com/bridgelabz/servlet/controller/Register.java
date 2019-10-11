package com.bridgelabz.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servlet.model.Student;
import com.bridgelabz.servlet.service.ImplStudentLogin;

@WebServlet("/register")
public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("mail");
		String mobile = req.getParameter("mobile");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();
		//res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		Student student = new Student();
		student.setName(username);
		student.setmailId(email);
		student.setMobNumber(mobile);
		student.setPassword(password);

		ImplStudentLogin data = new ImplStudentLogin();
		try {
			if (data.insertStudent(student) == 1) {
				session.setAttribute("username", email);
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.include(req, res);

			}
			else {
				out.print("<script>alert('Please try again')</script>");
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.include(req, res);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
