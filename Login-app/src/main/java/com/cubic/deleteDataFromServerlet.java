package com.cubic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/deleteData")
public class deleteDataFromServerlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("username");
		
		
		try {
			//loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			//creating the connection to database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch100","root","root");
			
			//query to delete the data by username
			String sql = "delete from signups_tbl where Username = ?";
			//compiling the query 
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//setting username which you want to delete
			pstmt.setString(1,uname);
			//executing the query
			pstmt.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("showSignup").forward(req, resp);
		
	}
}
