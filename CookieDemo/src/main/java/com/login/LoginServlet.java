package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("uname");
		
		//create cookie 
		Cookie ck = new Cookie("user", user);
		ck.setMaxAge(60); //cookie valide up to 60 second
		resp.addCookie(ck);
		resp.sendRedirect("profile");
	}
}
