package com.sj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rihana","root","Aeroplane3@");
		Statement stmt=connection.createStatement();
		ResultSet users=stmt.executeQuery("select * from table1");
		while(users.next()) {
			System.out.println(users.getInt(1)+","+users.getString(2)+","+users.getString(3));
		}
	}

}
