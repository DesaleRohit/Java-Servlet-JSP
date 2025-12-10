package com.claculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Calculator extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));

		String op = req.getParameter("btn");

		int result = 0;
		double div = 0;

		if (op.equals("Addition")) {
			result = a + b;
			out.println("<h2>Result: " + result + "</h2>");

		} else if (op.equals("Subtraction")) {
			result = a - b;
			out.println("<h2>Result: " + result + "</h2>");

		} else if (op.equals("Multiplication")) {
			result = a * b;
			out.println("<h2>Result: " + result + "</h2>");

		} else if (op.equals("Division")) {
			if (b == 0) {
				out.println("<h2>Cannot divide by zero!</h2>");
			} else {
				div = (double) a / b;
				out.println("<h2>Result: " + div + "</h2>");
			}
		}
	}
}
