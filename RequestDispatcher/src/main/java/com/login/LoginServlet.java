package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Email = req.getParameter("email");
		String Pass = req.getParameter("pass");

		PrintWriter out = resp.getWriter();
		try {
			if (Email.equals("admin@05") && Pass.equals("123")) {
				req.setAttribute("key", "Boss");

				RequestDispatcher requestDispatcher = req.getRequestDispatcher("/profile.jsp");
				requestDispatcher.forward(req, resp);
			} else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Email and Pasword did not match</h3>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
				requestDispatcher.include(req, resp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
