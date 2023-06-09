package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

@WebServlet("/showSignup")
public class showSignupDataServerlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//JDBC PROGRAMMING HERE TO SAVE DATA INSIDE DATABASE
		/*
		 * String name = req.getParameter("username"); String passWord =
		 * req.getParameter("password"); String email = req.getParameter("email");
		 * String gender = req.getParameter("gender");
		 */
		
		//this is not needed as we have new list "dto" 
		/*
		 * AccountDTO data = new AccountDTO(); data.setEmail(email);
		 * data.setGender(gender); data.setPassword(passWord); data.setUsername(name);
		 */
		
		
		try {
			//step-1 loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			//step-2 creating a connection to database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch100","root","root");
			String sql= "insert into signups_tbl(Username,Password,Gender,Email) values(?,?,?,?)";
			
			//step-3 compiling query
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//write code to fetch all the data from database
			String fetchData="select Username,Password,Gender,Email from signups_tbl";
			
			//executing this query
			pstmt = conn.prepareStatement(fetchData);
			ResultSet rs = pstmt.executeQuery();
			
			//clearing the data from the list
			DataStore.getSignupDTOs().clear();
			
			//rs.next points to the data 
			while(rs.next()) {
				String dusername= rs.getString(1);
				String dpassword= rs.getString(2);
				String dgender= rs.getString(3);
				String demail= rs.getString(4);
				
			
			
			//why are we creating new list ??
			//to add all the data that are fetched from the server

				SignupDTO dto=new SignupDTO();
			dto.setEmail(demail);
			dto.setGender(dgender);
			dto.setPassword(dpassword);
			dto.setUsername(dusername);
			
			DataStore.getSignupDTOs().add(dto);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("signUpSuccess.jsp").forward(req, resp);
			//trying to give pop-up error message on the same html page
			//PrintWriter body = resp.getWriter();
			//body.println("<h2> sdfafaadsfa </h2>");
			
		}
	
	}


