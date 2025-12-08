import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
public class Addition extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));

		int sum = a + b;

		PrintWriter out = res.getWriter();
		out.println("<h1>Result = " + sum + "</h1>");
	}
}
