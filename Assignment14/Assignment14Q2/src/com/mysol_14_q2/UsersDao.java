package com.mysol_14_q2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersDao implements AutoCloseable {
	private Connection con;

	public UsersDao() {
		try {
			con = DbUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public java.util.Date parse(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = new Date();
		try {
		date = sdf.parse(str);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	//Display all elements
	public List<Users> findAll() throws SQLException{
		List<Users> list = new ArrayList<>();
		String sql = "SELECT * FROM Users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					Users Users = new Users();
					Users.setId(rs.getInt("id"));
					Users.setFname(rs.getString("first_name"));
					Users.setLname(rs.getString("last_name"));
					Users.setEmail(rs.getString("email"));
					Users.setPass(rs.getString("password"));
					Users.setStatus(rs.getBoolean("status"));
					Users.setRole(rs.getString("role"));
					java.util.Date jDate =  rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(jDate);
					Users.setDate(bdate);
					list.add(Users);
				}
			} 
		}
		return list;
	}
	
	//Delete by Id
	public int deleteById(int id) throws SQLException{
		String sql = "DELETE FROM Users WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//Add a Users
	public int addUsers(Users Users) throws SQLException{
		String sql = "INSERT INTO Users VALUES(default, ?, ?, ? , ? , ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1, Users.getFname());
			stmt.setString(2, Users.getLname());
			stmt.setString(3, Users.getEmail());
			stmt.setString(4, Users.getPass());
			java.util.Date date = parse(Users.getDate());
			java.sql.Date sDate = new java.sql.Date( date.getTime() );
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, Users.isStatus());
			stmt.setString(7, Users.getRole());
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	//Change Users Status by Id
	public int changeStatusById(int id) throws SQLException{
		String sql = "UPDATE Users SET status = true WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateUsers(Users Users) throws SQLException{
		String sql = "UPDATE Users SET first_name = ?, last_name = ?, email = ?, password = ?, dob = ?, status = ?, role = ? WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1, Users.getFname());
			stmt.setString(2, Users.getLname());
			stmt.setString(3, Users.getEmail());
			stmt.setString(4, Users.getPass());
			java.util.Date date = parse(Users.getDate());
			java.sql.Date sDate = new java.sql.Date( date.getTime() );
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, Users.isStatus());
			stmt.setString(7, Users.getRole());
			stmt.setInt(8, Users.getId());
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	@Override
	public void close() {
		try {
			if(con != null) {
				con.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}