package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();

		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");

		String n = "admin";
		String p = "1234";

		if (name.equals(n) && pass.equals(p)) {
			out.println("<h1>Login Successful</h1>");
		} else {
			out.println("<h1>Login Failed</h1>");
		}
	}
}
