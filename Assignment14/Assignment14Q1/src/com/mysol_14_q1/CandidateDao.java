package com.mysol_14_q1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//AutoCloseable interface, which allows for automatic resource management 
public class CandidateDao implements AutoCloseable {
	
	private Connection con; //will store the database connection.
	
	//When a CandidateDao object is created, it establishes a database connection by calling DbUtil.getConnection(). 
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	//This is the close method, which is required because the class implements AutoCloseable
	@Override
	public void close() {
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws SQLException {
	    String sql_query = "INSERT INTO candidates (name, party, votes) VALUES (?, ?, ?)";
	    
	    try (PreparedStatement stmt = con.prepareStatement(sql_query)) {
	        stmt.setString(1, c.getName());
	        stmt.setString(2, c.getParty());
	        stmt.setInt(3, c.getVotes());
	        int cnt = stmt.executeUpdate();
	        return cnt;
	    } 
	}
	
	public int update(Candidate c) throws SQLException {
		// modify name and party for the id
		String sql_query= "UPDATE candidates SET name = ?, party= ? WHERE id = ?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql_query)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		} 
	}
	
	
}
			