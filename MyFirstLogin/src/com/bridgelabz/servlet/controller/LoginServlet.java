package com.bridgelabz.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servlet.model.Student;
import com.bridgelabz.servlet.service.ImplStudentLogin;
import com.bridgelabz.servlet.service.StudentLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		super();
	}

	ImplStudentLogin studentlogin = new ImplStudentLogin();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();

    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		
		 System.out.println(userName + " " + password + " "  );
		try {
			Student student = studentlogin.getStudent(userName, password);
			
			request.setAttribute("student", student);
			if (student.getmailId() != null) {
				System.out.println("student name" + student.getName());
				
				// System.out.println("forwarding");
				session.setAttribute("username", userName);
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else {
				out.print("<script>alert('Username and password incorrect')</script>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}

//			else if (submitType.equals("register")) {
//				//System.out.println("registering");
//				
//				student.setName(Name);
//				student.setmailId(mailId);
//				student.setMobNumber(mobNumber);
//				student.setPassword(password);
//				student.setReTypePassword(conformPassword);
//                studentlogin.insertStudent(student);  
//				request.setAttribute("successMessage", "Registration done,please login to continue");
//				request.getRequestDispatcher("login.jsp").forward(request, response);
//			}
//
//			else {
//				session.setAttribute("username", mailId);
//				request.setAttribute("message", "Data not found goto loginpage");
//				request.getRequestDispatcher("login.jsp").forward(request, response);
//			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
