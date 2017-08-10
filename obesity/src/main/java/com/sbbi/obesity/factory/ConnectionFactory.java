package com.sbbi.obesity.factory;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/obesity";
	//private static String DATABASE_URL = "jdbc:mysql://ec2-52-23-173-102.compute-1.amazonaws.com:3306/jiang";
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USER = "bruno"; //production
	private static String PASSWORD = "12345"; //production
	//private static String USER = "root"; //development
	//private static String PASSWORD = "root"; //development
	
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);
			
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
	
}
