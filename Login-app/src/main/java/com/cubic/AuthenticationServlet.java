package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		if (name.equals("jack")&& passWord.equals("jill")) {
			req.getRequestDispatcher("success.htm").forward(req, resp);
		}else {
			//incorrect password, forward to the same page
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			//trying to give pop-up error message on the same html page
			//PrintWriter body = resp.getWriter();
			//body.println("<h2> sdfafaadsfa </h2>");
			
		}
	}
}
