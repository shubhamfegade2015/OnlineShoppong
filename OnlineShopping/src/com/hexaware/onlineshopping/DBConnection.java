package com.hexaware.onlineshopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	

	static Connection con = null;
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	 public static Connection getDBConnection() {
		 //Register the Driver
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Password123");
			 return con;
			 
		 }catch(ClassNotFoundException | SQLException e ) {
			 e.printStackTrace();
			 
		 }
		return con;
		 
	 }


}
