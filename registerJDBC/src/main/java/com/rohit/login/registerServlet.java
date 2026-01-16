package com.rohit.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class registerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name1");
        String email = req.getParameter("email1");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dbconnect",
                "root",
                "root"
            );

            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO  registerInfo(name, email) VALUES (?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, email);

            int count = ps.executeUpdate();

            if (count > 0) {
                out.print("<h3>Registration successful</h3>");
            } else {
                out.print("<h3>Registration failed</h3>");
            }

            ps.close();
            conn.close();

        } catch (Exception e) {
            out.print("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace();
        }
    }
}
