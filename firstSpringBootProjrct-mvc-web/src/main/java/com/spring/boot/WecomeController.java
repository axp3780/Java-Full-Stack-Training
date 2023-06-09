package com.spring.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class WecomeController {

	@GetMapping("/clogin")
	public String showLogin() {
		  return "login"; //  login.jsp
	}
	
	@PostMapping("/csignup")
	public String signupPage(HttpServletRequest req, Model model) {
		//FETCHING THE DATA FROM FORM USING POST
		String uname = req.getParameter("username");
		String ppass = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		
		
		try {
			//JDBC PROGRAMMING TO STORE THE DATA FROM FORM
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch100","root","root");
			
			String sql= "insert into signups_tbl(Username,Password,Gender,Email) values(?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, ppass);
			pstmt.setString(4, email);
			pstmt.setString(3, gender);
			
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		model.addAttribute("message", "Your profile is created successfully and your data is saved on database");
		
		  return "signUp"; //  signUp.jsp
	}
	
	
	@GetMapping("/showSignup")
	public String showSignups() {
		try {
			//step-1 loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
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
		  return"signUpSuccess"; // signUpSuccess.jsp
	}
	
	@GetMapping("/deleteData")
	public String deleteDataFromDatabase(HttpServletRequest req, Model model) {
		
		String uname = req.getParameter("username");
		try {
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
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
		
		  return "signUpSuccess"; //  signUpSuccess.jsp
	}
	
	
	
}
