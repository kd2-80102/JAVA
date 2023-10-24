package com.mysol_14_q2;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLError;

//D: Define the class DbUtil.
//C: Constants are declared for the database driver, URL, username, and password.
//S: A static block is used to load the database driver class.
//S: A static method named getConnection returns a database connection.

public class DbUtil {
	
	public static final String DB_USER = "mysql -u KD2_80102_SarveshKadwe -p";
	public static final String DB_PASSWORD = "manager";
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";// MCJ
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC_DATABASES";// J.M.L. - 3306

	static {
		try {
			Class.forName(DB_DRIVER);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return con;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

