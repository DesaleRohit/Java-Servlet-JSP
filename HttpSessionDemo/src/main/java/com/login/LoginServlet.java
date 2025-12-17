package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		if ("admin@05".equals(email) && "123".equals(pass)) {

			HttpSession session = req.getSession();
			session.setAttribute("key", "Boss");

			resp.sendRedirect("profile.jsp"); 

		} else {
			resp.setContentType("text/html");
			resp.getWriter().println("<h3 style='color:red'>Invalid Credentials</h3>");

			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}
}
