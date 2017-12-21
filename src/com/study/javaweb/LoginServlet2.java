package com.study.javaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6188379608434250960L;
	private PreparedStatement statement;
	private ResultSet resultSet;
	private Connection connection;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pWriter = resp.getWriter();
		String username = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		String url = "jdbc:mysql://localhost:3306/hibernate";
		String user = "root";
		String password = "";
		String sql = "select count(id) from user where name= ? and password = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, pwd);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				int count = resultSet.getInt(1);
				System.out.println(count);
				if (count > 0) {
					pWriter.write("用户存在");
				} else {
					pWriter.write("成功");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				resultSet.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
