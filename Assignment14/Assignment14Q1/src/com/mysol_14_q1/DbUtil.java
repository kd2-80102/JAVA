package com.mysol_14_q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//utility class named DbUtil,
//or managing database connections. 
//It contains static fields and methods related to connecting to a MySQL database. 
public class DbUtil {
	
	public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";//remember it
	public static String DB_URL = "jdbc:mysql://localhost:3306/JDBC_DATABASES";//remember it
	public static String DB_USER = "KD2_80102_SarveshKadwe";
	public static String DB_PASSWORD = "manager";
	
	//block is responsible for loading the MySQL database m
	static {
		try{
			Class.forName(DB_DRIVER);//will load the our driver
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	
	//a static method that returns a Connection object.
	public static Connection getConnection() throws SQLException {
		Connection connector = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return connector;
	}
	

}
